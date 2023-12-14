package finaltc;

import java.util.Collection;
import java.util.ArrayList;


import org.antlr.v4.runtime.tree.Trees;

import org.antlr.v4.runtime.tree.ParseTree;


import finaltc.reglasParser.*;
import finaltc.TablaSimbolos.*;

public class miListener extends reglasBaseListener {

    private TablaSimbolos simbolTable;
    private boolean errorCodigo=false;
  
    public miListener() {
        simbolTable = TablaSimbolos.getInstance();
    }

    @Override
    public void enterPrograma(ProgramaContext ctx) {
      System.out.println("\n[Inicio del análisis de las IDs usadas y declaradas]\n");
      simbolTable.addContext();
     }

    @Override
    public void enterBloque(BloqueContext ctx) {
        
        if(ctx.getParent() instanceof Definicion_funcionContext){
            Definicion_funcionContext DfContext = (Definicion_funcionContext)ctx.getParent();

            ID func = Definicion_Funcion(DfContext);
            simbolTable.insertFunction(func);
            simbolTable.addContext();
            if(DfContext.parametros_funcion() != null){
                for(ID id: ( (Funcion) func).getParametros() ){
                    simbolTable.addId(id);
                }
            }  
        }else{
            simbolTable.addContext();
        }
    }
    

    
    @Override
    public void exitDeclaracion(DeclaracionContext ctx) {
        
    //  ID searchID = new ID(nombre, tipo);
      if(this.simbolTable.searchID(ctx.ID().getText()) != null){
               errorCodigo = true;
               ErrorListener.printError(ctx.getStop().getLine(), "ERROR SEMANTICO: Doble declaración de --[" + ctx.tipo_de_datos().getText() + " " + ctx.ID().getText() + "]");
      }

      String tipo = ctx.tipo_de_datos().getText();
      String nombre = ctx.ID().getText();
  
      if(ctx.asignar() != null){
             Variable id = new Variable(nombre, tipo, true,false);
             simbolTable.addId(id);
       }else{
            Variable id = new Variable(nombre, tipo, false,false);
            simbolTable.addId(id);
        }
      
    }

    @Override
    public void exitAsignacion(AsignacionContext ctx) {

        
        ID searchID = this.simbolTable.searchID(ctx.ID().getText());
    
        if( searchID == null ){
            errorCodigo = true;
            ErrorListener.printError(ctx.getStop().getLine(), "ERROR SEMANTICO : Uso de ID no declarado --[" + ctx.ID() + "]");
            return;
        }
        searchID.setInicializada(true);
    }




    private ArrayList<ID> obtenerParametros(Parametros_funcionContext ctx, ArrayList<ID> parametros){

        Collection<ParseTree> param = Trees.findAllRuleNodes(ctx, reglasParser.RULE_parametros_funcion);
        
        if(ctx.ID() != null){
            for(ParseTree parse: param){
                Parametros_funcionContext pfc = (Parametros_funcionContext) parse;
                Variable id = new Variable(pfc.ID().getText(), 
                                           pfc.tipo_de_datos().getText(), 
                                           true,
                                           false
                                           );
                parametros.add(id);
            }
            return parametros;
        }else{
            return null;
        }
    }

    private ID Definicion_Funcion(Definicion_funcionContext ctx){
        ArrayList<ID> parametros = new ArrayList<>();
        parametros = obtenerParametros(ctx.parametros_funcion(), parametros);
        
        ID prototipo = new Funcion(ctx.tipo_de_datos().getText(), ctx.ID().getText(), true, false);
        
        if(parametros != null){
            this.simbolTable.addParamContext();
            for(ID aux: parametros){
                if(this.simbolTable.searchID(aux.getNombre()) != null){
                        errorCodigo = true;
                        ErrorListener.printError(ctx.getStop().getLine(), "Doble declaración de: [" + aux.getTipo() + " " + aux.getNombre() + "]");
                }
                this.simbolTable.addId(aux);
            }
            ((Funcion)prototipo).setParametros(parametros);
            this.simbolTable.addId(prototipo);
            this.simbolTable.removeContext();
     
        }
        return prototipo;
    }


    @Override
    public void exitLlamada_funcion(Llamada_funcionContext ctx) {
       ID searchID = this.simbolTable.searchID(ctx.ID().getText());
       if(searchID == null){
        errorCodigo = true;
        ErrorListener.printError(ctx.getStop().getLine(), "ERROR SEMANTICO : Uso de Función no declarada: [" + ctx.ID() + "]");
        return;
       }else{
          searchID.setUsado(true);
       }
    }

    @Override
    public void exitIfor(IforContext ctx) {
        if (ctx.asignacion(0).ID() != null){
            ID searchId = this.simbolTable.searchID(ctx.asignacion(0).ID().getText());
            if(searchId == null){
                errorCodigo = true;
                ErrorListener.printError(ctx.getStop().getLine(), "ERROR SEMANTICO: Identificador no declarada: [" + ctx.asignacion(0).ID() + "]");
            }
        }
    }

    @Override
    public void exitFactor(FactorContext ctx) {

        if(ctx.ID() == null){
            return;
        }
        ID searchID = this.simbolTable.searchID(ctx.ID().getText());
        if(searchID  == null){
            errorCodigo = true;
            ErrorListener.printError(ctx.getStop().getLine(), "ERROR SEMANTICO : Uso de ID no declarado: [" + ctx.ID() + "]");
            return;
        }
        if(!searchID.isInicializada()){
            errorCodigo = true;
            ErrorListener.printError(ctx.getStop().getLine(), "ERROR SEMANTICO: Uso de ID no inicializado: [" + ctx.ID() + "]");
            return;
        }

        searchID.setUsado(true);
    }


    @Override
    public void exitPrograma(ProgramaContext ctx) {
      System.out.println(this.simbolTable.toString());
    }

    public boolean isErrorCodigo() {
        return errorCodigo;
    }

}

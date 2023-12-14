package finaltc;

import java.util.Collection;
import java.util.LinkedList;
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
    }

    
    @Override
    public void enterBloque(BloqueContext ctx) {
        this.simbolTable.addContext();
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
             Variable id = new Variable(nombre, tipo, true);
             simbolTable.addId(id);
       }else{
            Variable id = new Variable(nombre, tipo, false);
            simbolTable.addId(id);
        }
      
    }

    @Override
    public void exitAsignacion(AsignacionContext ctx) {
    
        ID searchID = this.simbolTable.searchID(ctx.ID().getText());

        if( searchID == null ){
            errorCodigo = true;
            ErrorListener.printError(ctx.getStop().getLine(), "ERROR SEMANTICO: Uso de ID no declarado --[" + searchID.getNombre() + "]");
            return;
        }
        searchID.setInicializada(true);
    }

/* 
    @Override
    public void exitParametros_funcion(Parametros_funcionContext ctx) {
        if(ctx.getChildCount() != 0){
            if(ctx.ID() != null){
                obtenerParametros(ctx, null)
              
                ID id = new ID(ctx.ID().getText(), ctx.tipo_de_datos().getText(), true);
                System.out.println(id);
                //simbolTable.addId(id);
                this.functionParams.add(id);
              
            }
        }
    }
 */


    private ArrayList<ID> obtenerParametros(Parametros_funcionContext ctx, ArrayList<ID> parametros){

        Collection<ParseTree> param = Trees.findAllRuleNodes(ctx, reglasParser.RULE_parametros_funcion);
        
        if(ctx.ID() != null){
            for(ParseTree parse: param){
                Parametros_funcionContext pfc = (Parametros_funcionContext) parse;
                Variable id = new Variable(pfc.ID().getText(), 
                                           pfc.tipo_de_datos().getText(), 
                                           true
                                           );
                parametros.add(id);
            }
            return parametros;
        }else{
            return null;
        }
    }


    @Override
    public void exitDefinicion_funcion(Definicion_funcionContext ctx) {
       
        if(this.simbolTable.searchID(ctx.ID().getText()) != null){
                errorCodigo = true;  
                ErrorListener.printError(ctx.getStop().getLine(), "ERROR SEMANTICO: Doble declaracion de función --[" + ctx.tipo_de_funcion().getText() + " " + ctx.ID().getText() + "]");
                return;
        }else{
            ArrayList<ID> functionsParams = new ArrayList<>();
           functionsParams = obtenerParametros(ctx.parametros_funcion(), functionsParams);

           if(functionsParams != null){
            for(ID aux: functionsParams){
                System.out.println(aux);
                if( this.simbolTable.searchID(aux.getNombre()) != null){
                        errorCodigo = true;
                        ErrorListener.printError(ctx.getStop().getLine(), "Doble declaración de: [" + aux.getTipo() + " " + aux.getNombre() + "]");
                }else{
                  simbolTable.addId(aux);
                }
            }
            Funcion funcion = new Funcion(ctx.tipo_de_funcion().getText(), ctx.ID().getText(), true, functionsParams);
            this.simbolTable.addId(funcion);
            functionsParams.clear();
           }
        }
    }

    /* 
    @Override
    public void exitDeclaracion_funcion(Declaracion_funcionContext ctx) {
         
        ID searchID = new ID(ctx.ID().getText(), ctx.tipo_de_funcion().getText());
        ID searchedID = this.simbolTable.searchId(searchID);

        if(searchedID != null){
            Funcion funcion = (Funcion) searchedID;
            errorCodigo = true;
            ErrorListener.printError(ctx.getStop().getLine(), "Doble definicion de función: [" + funcion.getTipo() + " " + funcion.getNombre() + "]");
            return;
        }
        ArrayList<ID> functionsParams = new ArrayList<>();
        for(ID aux: functionsParams){
            if( this.simbolTable.searchId(aux) != null){
                errorCodigo = true;
                ErrorListener.printError(ctx.getStop().getLine(), "Doble declaración de: [" + aux.getTipo() + " " + aux.getNombre() + "]");
            }else{
                simbolTable.addId(aux);
            }
        }
        Funcion funcion = new Funcion(searchID.getTipo(), searchID.getNombre(),false, functionsParams);
        this.simbolTable.addId(funcion);
    }
    */

    @Override
    public void exitLlamada_funcion(Llamada_funcionContext ctx) {
        System.out.println(ctx.getText());
       ID searchID = this.simbolTable.searchID(ctx.ID().getText());
       if(searchID == null){
        errorCodigo = true;
        ErrorListener.printError(ctx.getStop().getLine(), "ERROR SEMANTICO: Uso de Función no declarada: [" + searchID.getNombre() + "]");
        return;
       }else{
          searchID.setUsado(true);
       }
    }

    @Override
    public void exitIfor(IforContext ctx) {
        if (ctx.asignacion().ID() != null){
            ID searchId = this.simbolTable.searchID(ctx.asignacion().ID().getText());
            if(searchId == null){
                errorCodigo = true;
                ErrorListener.printError(ctx.getStop().getLine(), "ERROR SEMANTICO: Identificador no declarada: [" + ctx.asignacion().ID() + "]");
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
            ErrorListener.printError(ctx.getStop().getLine(), "ERROR SEMANTICO: Uso de ID no declarado: [" + ctx.ID() + "]");
            return;
        }else{
            if(!searchID.isInicializada()){
            errorCodigo = true;
            ErrorListener.printError(ctx.getStop().getLine(), "ERROR SEMANTICO: Uso de ID no inicializado: [" + ctx.ID() + "]");
            return;
            }
            searchID.setUsado(true);
        }
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
      System.out.println(this.simbolTable.toString());
    }

    public boolean isErrorCodigo() {
        return errorCodigo;
    }

}

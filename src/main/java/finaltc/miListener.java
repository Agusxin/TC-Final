package finaltc;

import java.util.LinkedList;

import finaltc.TablaSimbolos.*;
import finaltc.reglasParser.AsignacionContext;
import finaltc.reglasParser.BloqueContext;
import finaltc.reglasParser.DeclaracionContext;
import finaltc.reglasParser.Declaracion_funcionContext;
import finaltc.reglasParser.Definicion_funcionContext;
import finaltc.reglasParser.FactorContext;
import finaltc.reglasParser.Llamada_funcionContext;
import finaltc.reglasParser.Parametros_funcionContext;
import finaltc.reglasParser.ProgramaContext;
import finaltc.reglasParser.Lista_declaracionContext;

public class miListener extends reglasBaseListener {

    private TablaSimbolos simbolTable;
    private LinkedList<ID> functionParams;
    private boolean errorCodigo=false;
   
    public miListener() {
        simbolTable = TablaSimbolos.getInstance();
        functionParams = new LinkedList<ID>();
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
        

      String tipo = ctx.tipo_de_datos().getText();
      String nombre = ctx.ID().getText();
      ID searchID = new ID(nombre, tipo);

      if(this.simbolTable.searchId(searchID) != null){
               errorCodigo = true;
               ErrorListener.printError(ctx.getStop().getLine(), "Doble declaración de: [" + tipo + " " + nombre + "]");
      } 
      
      Lista_declaracionContext verificarChilds = ctx.lista_declaracion();

        if(verificarChilds.getChildCount() == 0){
            ID id = new ID(nombre, tipo, false);
            System.out.println(id);
            simbolTable.addId(id);
        }

        while(verificarChilds.getChildCount() != 0){
             
            if(verificarChilds.getChild(0).getText().equals("=")){
                ID id = new ID(nombre, tipo, true);
                simbolTable.addId(id);
            }
            if(verificarChilds.getChild(0).getText().equals(",")){
                ID id = new ID(nombre, tipo, false);
                simbolTable.addId(id);
            }
            verificarChilds = verificarChilds.lista_declaracion();
        }
        
    }

    @Override
    public void exitAsignacion(AsignacionContext ctx) {
    
        ID searchID = new ID(ctx.ID().getText(), "");

        if( this.simbolTable.searchId(searchID) == null ){
            errorCodigo = true;
            ErrorListener.printError(ctx.getStop().getLine(), "Uso de ID no declarado: [" + searchID.getNombre() + "]");
            return;
        }

        searchID.setInicializada(true);
    }


    @Override
    public void exitParametros_funcion(Parametros_funcionContext ctx) {
        if(ctx.getChildCount() != 0){
            if(ctx.ID() != null){
                ID id = new ID(ctx.ID().getText(), ctx.tipo_de_datos().getText(), true);
                this.functionParams.add(id);
            }
        }
    }


    @Override
    public void exitDefinicion_funcion(Definicion_funcionContext ctx) {
        ID searchID = new ID(ctx.ID().getText(), ctx.tipo_de_funcion().getText());
        ID searchedID = this.simbolTable.searchId(searchID);

        if(searchedID != null){
            Funcion funcion = (Funcion) searchedID;
            if(funcion.getDefinida()){
                errorCodigo = true;  
                ErrorListener.printError(ctx.getStop().getLine(), "Doble definicion de función: [" + searchID.getTipo() + " " + searchID.getNombre() + "]");
                return;
            }else{
                funcion.setDefinida(true);
            }
        }else{
            LinkedList<ID> functionParamsCopy = new LinkedList<>();

            for(int i = 0; i < functionParams.size(); i++){
                functionParamsCopy.add(functionParams.get(i));
            }

            Funcion funcion = new Funcion(searchID.getTipo(), searchID.getNombre(), true, functionParamsCopy);
            this.simbolTable.addId(funcion);
            this.functionParams.clear();
        }
    }

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

        LinkedList<ID> functionParamsCopy = new LinkedList<>();

       for(int i = 0; i < functionParams.size(); i++){
         functionParamsCopy.add(functionParams.get(i));
       }

        Funcion funcion = new Funcion(searchID.getTipo(), searchID.getNombre(),false, functionParamsCopy);
        this.simbolTable.addId(funcion);
        this.functionParams.clear();
    }

    @Override
    public void exitLlamada_funcion(Llamada_funcionContext ctx) {
       ID searchID = new ID(ctx.ID().getText(), "");
       ID searched = this.simbolTable.searchId(searchID);
       if(searched == null){
        errorCodigo = true;
        ErrorListener.printError(ctx.getStop().getLine(), "Uso de Función no declarada: [" + searchID.getNombre() + "]");
        return;
       }else{
          searched.setUsado(true);
       }
    }

    @Override
    public void exitFactor(FactorContext ctx) {
        
        if(ctx.ID() != null){
            ID searchID = new ID(ctx.ID().getText(), "");
            ID searched = this.simbolTable.searchId(searchID);

            if(searched  == null){
                errorCodigo = true;
                ErrorListener.printError(ctx.getStop().getLine(), "Uso de ID no declarado: [" + searchID.getNombre() + "]");
            }else{
               if(!searched.isInicializada()){
                errorCodigo = true;
                ErrorListener.printError(ctx.getStop().getLine(), "Uso de ID no inicializado: [" + searchID.getNombre() + "]");
               }else{
                 searched.setUsado(true);
               }
            }
        }
        return;
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
       System.out.println(this.simbolTable.toString());
    }

    public boolean isErrorCodigo() {
        return errorCodigo;
    }

}

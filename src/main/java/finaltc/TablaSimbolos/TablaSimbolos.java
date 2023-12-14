package finaltc.TablaSimbolos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Iterator;


public class TablaSimbolos {

    private LinkedList<Map<String, ID>> tablaSimbolos;
    private LinkedList<Map<String, ID>> historialTablaSimbolos;
    private static TablaSimbolos instance;
    

    public static TablaSimbolos getInstance() {
        if(instance == null)
            instance = new TablaSimbolos();

        return instance;
    }

    public TablaSimbolos() {
        this.tablaSimbolos = new LinkedList<Map<String, ID>>();
        this.historialTablaSimbolos = new LinkedList<Map<String, ID>>(); 
        this.addContext();
    }

    public void addId(ID id) {
        this.tablaSimbolos.getLast().put(id.getNombre(), id);
        this.historialTablaSimbolos.get(this.historialTablaSimbolos.size() - 1).put(id.getNombre(), id);
    }

 
    public ID searchLocalID (String id, Map<String, ID> map) {
        return map.get(id);
    };

    public ID searchID (String id){
        Iterator<Map<String, ID>> iterator = this.tablaSimbolos.descendingIterator();
        while (iterator.hasNext()) 
        {
            Map<String, ID> temp = iterator.next();
            if(this.searchLocalID(id, temp) != null){
                return this.searchLocalID(id, temp);
            }
        }
        return null;
    };


    public void addContext() {
        HashMap<String, ID> context = new HashMap<String,ID>();       
        this.tablaSimbolos.add(context);
        this.historialTablaSimbolos.add(context);
    }

    public void addParamContext(){
        HashMap<String, ID> context = new HashMap<String,ID>();       
        this.tablaSimbolos.add(context);
        this.historialTablaSimbolos.add(context);
    }

     
    public void removeContext() {
        this.tablaSimbolos.removeLast();
    }

    public void insertFunction(ID function){
        if(this.tablaSimbolos.size() > 1){
            this.tablaSimbolos.get(this.tablaSimbolos.size()-2).put(function.getNombre(), function);
        }else{
            this.tablaSimbolos.get(this.tablaSimbolos.size()-1).put(function.getNombre(), function);
        }
    }

   

    
    public int getContextSize() {
        return this.tablaSimbolos.size();
    }

    @Override
    public String toString() {
        int ctx = 1;
        String salida = "";
        salida = salida.concat("\n------TABLA DE SIMBOLOS------\n");
         
        for (Map<String, ID> contexto : this.tablaSimbolos) {
            salida = salida.concat("Contexto: " + ctx++ + "\n {\n");
            for (ID id : contexto.values()) {
                salida = salida.concat("    " + id.toString() + "\n");
            }
            salida = salida.concat("}\n");
        }
        return salida;      
    }
}

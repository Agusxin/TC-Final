package finaltc.TablaSimbolos;

import java.util.HashMap;
import java.util.LinkedList;


public class TablaSimbolos {

    private LinkedList<HashMap<String, ID>> tablaSimbolos;
    private LinkedList<HashMap<String, ID>> historialTablaSimbolos;
    private static TablaSimbolos instance;
    

    public static TablaSimbolos getInstance() {
        if(instance == null)
            instance = new TablaSimbolos();

        return instance;
    }

    public TablaSimbolos() {
        this.tablaSimbolos = new LinkedList<HashMap<String, ID>>();
        this.historialTablaSimbolos = new LinkedList<HashMap<String, ID>>(); 
        this.addContext();
    }

    public void addContext() {
        HashMap<String, ID> context = new HashMap<String,ID>();       
        this.tablaSimbolos.add(context);
        this.historialTablaSimbolos.add(context);
    }

    
    public void removeContext() {
        this.tablaSimbolos.removeLast();
    }

    
    public int getContextSize() {
        return this.tablaSimbolos.size();
    }

    
    public void addId(ID id) {
    
        this.tablaSimbolos.getLast().put(id.getNombre(), id);
        this.historialTablaSimbolos.get(this.historialTablaSimbolos.size() - 1).put(id.getNombre(), id);
    }


    public ID searchId(ID id) {
        for(int i = 0; i < this.tablaSimbolos.size(); i++) {
            if(this.tablaSimbolos.get(i).containsKey(id.getNombre()))
                return this.tablaSimbolos.get(i).get(id.getNombre());
        }

        return null;
    }

    @Override
    public String toString() {
        int ctx = 1;
        String salida = "";
        salida = salida.concat("\n------TABLA DE SIMBOLOS------\n");
         
        for (HashMap<String, ID> contexto : this.tablaSimbolos) {
            salida = salida.concat("Contexto: " + ctx++ + "\n {\n");
            for (ID id : contexto.values()) {
                salida = salida.concat("    " + id.toString() + "\n");
            }
            salida = salida.concat("}\n");
        }
        return salida;      
    }
}

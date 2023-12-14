package finaltc.TablaSimbolos;

import java.util.ArrayList;

public class Funcion extends ID {
  
    private ArrayList<ID> parametros;


   public Funcion(String tipo, String nombre,Boolean inicializada, Boolean usado) {
       super.setTipo(tipo);
       super.setNombre(nombre);
       super.setInicializada(inicializada == true);
       super.setUsado(usado);
       this.parametros = new ArrayList<ID>();
   }

   @Override
   public String toString() {
       String tipo = this.getTipo();
       String nombre = this.getNombre();
       Boolean inicializada = this.isInicializada();
       Boolean usada = this.isUsado();
       ArrayList<ID> parametros = this.parametros;
       return "[" + tipo + " " + nombre + "]" + " Función inicializada: " + inicializada + " -Es usada: " + usada + " Tipos de sus parametros: " + parametros;

   }


   public ArrayList<ID> getParametros() {
       return parametros;
   }

   public void setParametros(ArrayList<ID> parametros) {
       this.parametros = parametros;
   }

}

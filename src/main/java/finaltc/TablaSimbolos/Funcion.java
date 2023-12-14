package finaltc.TablaSimbolos;

import java.util.ArrayList;

public class Funcion extends ID {
   // private Boolean definida;
    private ArrayList<ID> parametros;


    public Funcion(String tipo, String nombre,Boolean inicializada, ArrayList<ID> parametros) {
        super.setTipo(tipo);
        super.setNombre(nombre);
        super.setInicializada(inicializada == true);
        super.setUsado(false);
        this.parametros = parametros;
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
/*
    public Boolean getDefinida() {
        return definida;
    }

    public void setDefinida(Boolean definida) {
        this.definida = definida;
    }
*/
}

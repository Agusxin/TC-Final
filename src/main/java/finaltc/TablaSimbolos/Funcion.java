package finaltc.TablaSimbolos;

import java.util.LinkedList;

public class Funcion extends ID {
    private Boolean definida;
    private LinkedList<ID> parametros;


    public Funcion(String tipo, String nombre,Boolean definida, LinkedList<ID> parametros) {
        super.setTipo(tipo);
        super.setNombre(nombre);
        super.setInicializada(true);
        super.setUsado(false);
        this.definida = definida;
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        String tipo = this.getTipo();
        String nombre = this.getNombre();
        Boolean inicializada = this.isInicializada();
        Boolean usada = this.isUsado();
        LinkedList<ID> parametros = this.parametros;
        return "[" + tipo + " " + nombre + "]" + " Función inicializada: " + inicializada + " -Es usada: " + usada + " Tipos de sus parametros: " + parametros;
    }

    public Boolean getDefinida() {
        return definida;
    }

    public void setDefinida(Boolean definida) {
        this.definida = definida;
    }
}

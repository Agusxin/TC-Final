package finaltc.TablaSimbolos;

public class Variable extends ID {

    public Variable(String nombre_token, String tipo, boolean inicializado, Boolean usado){
        super.setNombre(nombre_token);
        super.setTipo(tipo);
        super.setInicializada(inicializado);
        super.setUsado(usado);
    }

    @Override
    public String toString() {
        return this.getTipo() + " " + this.getNombre() + " inicializada: " + this.isInicializada() + " usada: " + this.isUsado();
    }
    
}

package ejer4_coche;

/**
 *
 * @author alvaro
 */
public class Turismo extends Vehiculo{
    // Además de los atributos de Vehiculo, esta clase tiene los siguientes
    private int puertas;
    private boolean marchaAutomatica;
    // El constructor tiene como parametros todos los atributos necesarios para
    // poder inicializar los atributos de Vehiculo y Turismo

    public Turismo(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, int puertas, boolean marchaAutomatica) {

        // Llamada al constructor de la superclase
        // con los atributos propios de Vehiculo
        super(bastidor, matricula, marca, modelo, color, tarifa);

        // Inicializacíon de los atributos propios del objeto Turismo
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }
    
    public Turismo() {

    }

    // Esta clase ahora no implementa métodos aunque hereda los de Vehiculo
    // No implementa constructor, Java creará uno por defecto
//    public String getAtributos() {
//
//        String atributosSuperClase;
//
//        // Llamada al método getAtributos() de la clase Vehiculo
//        atributosSuperClase = super.getAtributos();
//
//        // Ahora concateno los atributos de la superclase con los de la subclase
//        return atributosSuperClase + " Puertas: " + this.puertas + " Marcha automática: " + this.marchaAutomatica;
//    }
    public int getPuertas() {
        return this.puertas;
    }

    public boolean getMarchaAutomatica() {
        return this.marchaAutomatica;
    }

    @Override
    public String getAtributos() {

        // Llamada al método getAtributos() de la clase Vehiculo
        return super.getAtributos() + ";" + this.puertas + ";" + this.marchaAutomatica;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    public void setMarchaAutomatica(boolean marchaAutomatica) {
        this.marchaAutomatica = marchaAutomatica;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return super.toString() + ":" + puertas + ":" + marchaAutomatica;
    }
}
package ejer4_coche;

/**
 *
 * @author alvaro
 */
public class Furgoneta extends Vehiculo{
    // Atributos específicos

    private int carga;
    private int volumen;

    public Furgoneta(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, int carga, int volumen) {
        super(bastidor, matricula, marca, modelo, color, tarifa); // Constructor padre
        this.carga = carga;
        this.volumen = volumen;
    }
// métodos ‘get’ de la subclase Furgoneta. Se omiten setters

    public int getCarga() {
        return this.carga;
    }

    public int getVolumen() {
        return this.volumen;
    }

    @Override
    public String getAtributos() {
        return super.getAtributos() + "; " + this.carga
                + "; " + this.volumen;
    }

    @Override
    public String toString() {
        return super.toString() + ":" + carga + ":" + volumen;
    }
}
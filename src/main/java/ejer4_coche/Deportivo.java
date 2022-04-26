package ejer4_coche;

/**
 *
 * @author alvaro
 */
public class Deportivo extends Vehiculo {
    private int cilindrada; // Atributo específico para Deportivo

    public Deportivo(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, int cilindrada) {
        super(bastidor, matricula, marca, modelo, color, tarifa); // Constructor padre
        this.cilindrada = cilindrada;
    }
    
    public Deportivo() {
    }
// métodos ‘get’ de la subclase Deportivo. Se omiten setters 

    public int getCilindrada() {
        return this.cilindrada;
    }

    @Override
    public String getAtributos() {
        return super.getAtributos() + "; " + this.cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + ":" + cilindrada;
    }
}

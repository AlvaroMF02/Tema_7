package ejer11;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author alváro
 */
public class App {
    private int codUnico; //se implementará con un contador de instancias.
    private String nombre; //“app+codigo único+letra aleatoria (a-z)”.
    private String descripcion; //String aleatorio de un conjunto de 10 descripciones que tú decidas.
    private double tamanioKb; 
    private int numDescargas;
    
    private static int codigo = 1;  
    private static Random alea = new Random();
    private static String[] descripciones = {"Mensajes", "Calendario", "Telefono","Ajustes", 
        "Tiempo", "Notas", "Grinder","Discord", "BurgerKing", "Snapchat"};                 //array con las apps
    
    public App(int codUnico, String nombre, String descripcion, double tamanioKb, int numDescargas) {
        this.codUnico = codUnico;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamanioKb = tamanioKb;
        this.numDescargas = numDescargas;
    }
    
    public App() {
        this.codUnico = codigo;
        this.nombre = metNombre();
        this.descripcion = descripciones[alea.nextInt(descripciones.length)];   
        this.tamanioKb = alea.doubles(1, 100.0, 1024.0).findFirst().getAsDouble(); //DoubleStream 
        this.numDescargas = alea.ints(1, 0, 50000).findFirst().getAsInt(); //IntStream 
        
        codigo++;
    }

    
    
    private static String metNombre(){
        char letra = (char) (alea.nextInt(122 - 97 + 1) + 97);
        return "app" + codigo + letra;
    }    
    
  
    
    
    
    public int getCodUnico() {
        return codUnico;
    }

    public void setCodUnico(int codUnico) {
        this.codUnico = codUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTamanioKb() {
        return tamanioKb;
    }

    public void setTamanioKb(double tamanioKb) {
        this.tamanioKb = tamanioKb;
    }

    public int getNumDescargas() {
        return numDescargas;
    }

    public void setNumDescargas(int numDescargas) {
        this.numDescargas = numDescargas;
    }

    
    @Override
    public String toString() {
        return codUnico + ";" + nombre + ";" + descripcion + ";" + tamanioKb + ";" + numDescargas;
    }
    
    
}

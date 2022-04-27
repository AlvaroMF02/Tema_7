package ejer4_coche;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author copiado entendiendo :)
 */

/*
    LEER EL ARCHIVO Y ORDENAR LOS VEHICULOS POR MARCA
*/

public class ejer7 {
    public static void main(String[] args) {
        
        String idFichero = "coches.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        //Array para almacenar las posicione donde se encuentra la secuencia de caracteres
        ArrayList<Vehiculo> listaVehiculo = new ArrayList<>();

        System.out.println("Leyendo el fichero: " + idFichero);

        //LECTURA DE COCHES
        try (Scanner datosFichero = new Scanner(new File(idFichero))) {
            
            while(datosFichero.hasNextLine()){
                linea = datosFichero.nextLine();  //salta de linea
                tokens = linea.split(":");  //muestra el separador
 
                Vehiculo coche = new Vehiculo();
                coche.setBastidor(tokens[0]);
                
            }
            

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        
        
    }
}
package ejer4_coche;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */

/*
Realiza un programa que lea los datos del ejercicio 4. Para ello creará una 
lista de objetos de tipo Vehículo. El programa irá almacenando en la lista 
los objetos leídos desde el archivo de texto “vehículos.txt”. Una vez cargados 
todos los datos en la lista, ordena los vehículos por Marca y muestra el 
resultado por consola.
*/
public class ejer7 {
     public static void main(String[] args) {
        // Fichero a leer con datos de ejemplo
        String idFichero = "vehiculos.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        //Array para almacenar las posicione donde se encuentra la secuencia de caracteres
        ArrayList<Vehiculo> listaVehiculo = new ArrayList<>();

        ArrayList<Turismo> listaTurismo = new ArrayList<>();
        ArrayList<Deportivo> listaDeportivo = new ArrayList<>();
        ArrayList<Furgoneta> listaFurgoneta = new ArrayList<>();

        System.out.println("Leyendo el fichero: " + idFichero);


        try (Scanner datosFichero = new Scanner(new File(idFichero))) {

            datosFichero.nextLine();

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(":");

                switch (Integer.parseInt(tokens[0])) {
                    case 0:
                        Turismo t1 = new Turismo();
                        t1.setBastidor(Long.parseLong(tokens[1]));
                        t1.setMatricula(tokens[2]);
                        t1.setMarca(tokens[3]);
                        t1.setModelo(tokens[4]);
                        t1.setColor(tokens[5]);
                        t1.setTarifa(Double.parseDouble(tokens[6]));
                        t1.setDisponible(Boolean.parseBoolean(tokens[7]));
                        t1.setPuertas(Integer.parseInt(tokens[8]));
                        t1.setMarchaAutomatica(Boolean.parseBoolean(tokens[9]));
                        listaVehiculo.add(t1);
                        listaTurismo.add(t1);
                        break;
                    case 1:
                        Deportivo d1 = new Deportivo();
                        d1.setBastidor(Long.parseLong(tokens[1]));
                        d1.setMatricula(tokens[2]);
                        d1.setMarca(tokens[3]);
                        d1.setModelo(tokens[4]);
                        d1.setColor(tokens[5]);
                        d1.setTarifa(Double.parseDouble(tokens[6]));
                        d1.setCilindrada(Integer.parseInt(tokens[8]));
                        
                        listaVehiculo.add(d1);
                        listaDeportivo.add(d1);
                        break;
                    case 2:
                        Furgoneta f1 = new Furgoneta();
                        f1.setBastidor(Long.parseLong(tokens[1]));
                        f1.setMatricula(tokens[2]);
                        f1.setMarca(tokens[3]);
                        f1.setModelo(tokens[4]);
                        f1.setColor(tokens[5]);
                        f1.setTarifa(Double.parseDouble(tokens[6]));
                        f1.setCarga(Integer.parseInt(tokens[7]));
                        f1.setVolumen(Integer.parseInt(tokens[8]));
                        listaVehiculo.add(f1);
                        listaFurgoneta.add(f1);
                        break;
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //Collections.sort(listaVehiculo);

        for (Vehiculo lista : listaVehiculo) {
            System.out.println(lista);

        }
    }
    
    
}

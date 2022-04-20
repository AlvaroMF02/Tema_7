package ejer4_coche;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class ejer4 {
    public static void main(String[] args) {
        
       String idFichero="vehiculos.txt";
       ArrayList<Vehiculo> coches = new ArrayList<>();
       
       
       
       
       try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))){
            
        //Turismos
        coches.add(new Turismo(Long.MAX_VALUE, "6151", "nose", "j", "verde", 12.36, 2, true));
        coches.add(new Turismo(Long.MAX_VALUE, "6151", "nose", "j", "verde", 12.36, 2, true));
        coches.add(new Turismo(Long.MAX_VALUE, "6151", "nose", "j", "verde", 12.36, 2, true));
        coches.add(new Turismo(Long.MAX_VALUE, "6151", "nose", "j", "verde", 12.36, 2, true));
        coches.add(new Turismo(Long.MAX_VALUE, "6151", "nose", "j", "verde", 12.36, 2, true));
        coches.add(new Turismo(Long.MAX_VALUE, "6151", "nose", "j", "verde", 12.36, 2, true));
        coches.add(new Turismo(Long.MAX_VALUE, "6151", "nose", "j", "verde", 12.36, 2, true));
        coches.add(new Turismo(Long.MAX_VALUE, "6151", "nose", "j", "verde", 12.36, 2, true));
        coches.add(new Turismo(Long.MAX_VALUE, "6151", "nose", "j", "verde", 12.36, 2, true));
        coches.add(new Turismo(Long.MAX_VALUE, "6151", "nose", "j", "verde", 12.36, 2, true));

        //Furgonetas
        coches.add(new Furgoneta(Long.MAX_VALUE, "5516", "seat", "l", "amarillo", 54.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "5516", "seat", "l", "amarillo", 54.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "5516", "seat", "l", "amarillo", 54.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "5516", "seat", "l", "amarillo", 54.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "5516", "seat", "l", "amarillo", 54.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "5516", "seat", "l", "amarillo", 54.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "5516", "seat", "l", "amarillo", 54.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "5516", "seat", "l", "amarillo", 54.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "5516", "seat", "l", "amarillo", 54.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "5516", "seat", "l", "amarillo", 54.36, 654, 235));


        //Deportivos
        coches.add(new Deportivo(Long.MAX_VALUE, "6158", "siu", "ñ", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "6158", "siu", "ñ", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "6158", "siu", "ñ", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "6158", "siu", "ñ", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "6158", "siu", "ñ", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "6158", "siu", "ñ", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "6158", "siu", "ñ", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "6158", "siu", "ñ", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "6158", "siu", "ñ", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "6158", "siu", "ñ", "rojo", 31651, 965));









             flujo.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
       }
       
       
    }
    
}

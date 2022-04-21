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
        coches.add(new Turismo(Long.MAX_VALUE, "61512824", "fiat", "A4", "amarillo", 1651.36, 2, true));
        coches.add(new Turismo(Long.MAX_VALUE, "65846546", "audi", "9M", "rojo", 1651.32, 4, true));
        coches.add(new Turismo(Long.MAX_VALUE, "89658528", "fiat", "P0", "verde", 6485.25, 2, true));
        coches.add(new Turismo(Long.MAX_VALUE, "12542862", "audi", "9M", "azul", 1651.36, 4, true));
        coches.add(new Turismo(Long.MAX_VALUE, "36988585", "fiat", "O9", "negro", 1651.36, 4, true));
        coches.add(new Turismo(Long.MAX_VALUE, "25878528", "audi", "A4", "blanco", 1651.36, 2, true));
        coches.add(new Turismo(Long.MAX_VALUE, "14782855", "fiat", "9M", "naranja", 1651.36, 4, true));
        coches.add(new Turismo(Long.MAX_VALUE, "35135135", "audi", "V6", "morado", 61516.36, 2, false));
        coches.add(new Turismo(Long.MAX_VALUE, "61514252", "fiat", "A4", "rosa", 88555.25, 4, true));
        coches.add(new Turismo(Long.MAX_VALUE, "61514524", "audi", "C3", "azul", 999.99, 4, true));

        //Furgonetas
        coches.add(new Furgoneta(Long.MAX_VALUE, "55162752", "seat", "OP4", "amarillo", 88555.25, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "55527516", "ducato", "LÑS", "rojo", 61516.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "55725516", "seat", "87Y", "azul", 1651.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "25425516", "ducato", "ASD8", "amarillo", 88555.25, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "42525516", "seat", "SADA9", "blanco", 61516.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "55164524", "ducato", "RG3", "azul", 1651.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "55452416", "seat", "LO3", "morado", 61516.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "55452416", "ducato", "ÑP9", "amarillo", 88555.25, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "55242116", "seat", "PN5", "naranja", 1651.36, 654, 235));
        coches.add(new Furgoneta(Long.MAX_VALUE, "57417516", "ducato", "OGT", "amarillo", 61516.36, 654, 235));


        //Deportivos
        coches.add(new Deportivo(Long.MAX_VALUE, "61582754", "lambogini", "OGT", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "62452158", "siu", "PN5", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "61538758", "lambogini", "OGT", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "64524158", "siu", "PN5", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "61724458", "lambogini", "OGT", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "62452158", "siu", "PN5", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "64524158", "lambogini", "PN5", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "45246158", "lambogini", "PN5", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "61582454", "siu", "OGT", "rojo", 31651, 965));
        coches.add(new Deportivo(Long.MAX_VALUE, "61524458", "lambogini", "ñ", "rojo", 31651, 965));



            for (int i = 0; i < coches.size(); i++) {
                if (coches.get(i) instanceof Turismo) {
                    flujo.write("0- "+coches.get(i).toString()+":");
                    flujo.newLine();
                }else if (coches.get(i) instanceof Furgoneta){
                    flujo.write("1- "+coches.get(i).toString()+":");
                    flujo.newLine();
                }else{
                    flujo.write("2- "+coches.get(i).toString()+":");
                    flujo.newLine();
                }
                    
            }


            flujo.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
       }
       
       
    }
    
}

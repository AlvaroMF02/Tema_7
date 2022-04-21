package ejer7a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Main {

     public static void main(String[] args) {
        // Fichero a leer con datos de ejemplo
        String idFichero = "RelPerCen.csv";

        // Variables 
        ArrayList<POJO> listaProfesores = new ArrayList<>();
        String[] tokens;        //donde se guarda cada campo
        String linea;           //linea del csv
        Map<String, Integer> cantidad = new HashMap<>();    //MAP

        System.out.println("Se está leyendo el fichero: " + idFichero + "\n");

        //Lectura del ficghero con Scanner
        //( BufferedReader datosFichero = new BufferedReader(new FileReader (idFichero))) mio
        try ( Scanner datosFichero = new Scanner(new  File(idFichero))) {
            datosFichero.nextLine();//nextLine(); //salta de linea, se hace porque en la tabla es el nomber de la columna
            
            while (datosFichero.hasNextLine()) {//mientras que haya lineas sigue el bucle
                linea = datosFichero.nextLine();  //para que vaya saltando de linea
                
                linea = linea.replaceAll("\"", ""); //este metodo remplaza la " por nada(el segundo)    LocalDate
                
                tokens = linea.split(",");  //con esto dices que la coma separa todos los campos, tambien separa empleados ya que hay una coma de por medio
                //System.out.println(linea + "\t"); para ver como recibe el documento
                
                
                POJO p1 = new POJO(); //guardar todo lo de token 
                
                p1.setApellidos(tokens[0]); //metes informacion de tokens al objeto p1
                p1.setNombre(tokens[1]);
                p1.setDni(tokens[2]);
                p1.setPuesto(tokens[3]);
                p1.setFechaToma(LocalDate.parse(tokens[4], DateTimeFormatter.ofPattern("dd/MM/yyyy")));     //conversion de String a LocalDate
                
                if (tokens[5].equalsIgnoreCase("")) {   //para los null
                    p1.setFechaCese(null);
                }else{
                    p1.setFechaCese(LocalDate.parse(tokens[5], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                }
                
                p1.setTelefono(tokens[6]);
                
                if (tokens[7].equalsIgnoreCase("Si")) {   //hace que los si sean true 
                    p1.setEvaluador(true);
                }else{
                    p1.setEvaluador(false);
                }
                
                if (tokens[8].equalsIgnoreCase("Si")) {   //hace que los si sean true 
                    p1.setCoordinador(true);
                }else{
                    p1.setCoordinador(false);
                }
                
                
                listaProfesores.add(p1);     //meto el objeto en la lista 
                
            }
            
            
            }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            }
            //imprimir lista
            for (POJO p : listaProfesores) {
                System.out.println(p.toString());
            }
            
            for (POJO lista : listaProfesores) {    //hacer los map
                //saca el puesto y lo mete en el map
                if (cantidad.containsKey(lista.getPuesto()) ) { //si el puesto se repite lo sumas
                    int control = cantidad.get(lista.getPuesto());  
                    cantidad.put(lista.getPuesto(), control+1);//suma los puestos
                }else{
                    cantidad.put(lista.getPuesto(),1);  //sino los deja en 1
                }
            }
            
            
            //ESCRITURA
            String idFichero2 = "profesoresPorDepartamento.csv";
            
            try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
                
                for (Map.Entry<String, Integer> m : cantidad.entrySet()) {
                    flujo.write(m.getKey() + m.getValue());
                    flujo.newLine();
                }
                
                flujo.flush();
                System.out.println("El fichero"+ idFichero2 + " se ha creado correctamente");
                
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
    }
}
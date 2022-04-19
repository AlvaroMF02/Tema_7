package ejer1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alvaro
 */
public class ejer1Alvaro {

    public static void main(String[] args) {
        // fichero que se crea al ejecutar 
        String idFichero = "matriz.txt";
        String tmp;
        //creamos array
        int matrizNumeros[][] = {{100, 101, 102, 103}, {200, 201, 202, 203}, {300, 301, 302, 303}, {400, 401, 402, 403}};

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            for (int i = 0; i < matrizNumeros.length; i++) {
                for (int j = 0; j < matrizNumeros[i].length; j++) {
                    // Obtengo en un String el elemento int de la matriz
                    tmp = String.valueOf(matrizNumeros[i][j]);
                    if (j == matrizNumeros[i].length - 1) {
                        //.write escribe en el buffer
                        flujo.write(tmp);
                    } else {
                        flujo.write(tmp + "\t");
                    }
                }
                //newLine hace un salto de linea despues de cada fila
                flujo.newLine();
            }
            //.flush guarda en el disco duro
            flujo.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}

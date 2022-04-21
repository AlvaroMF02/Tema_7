package ejer2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */

/*------------------------------------------------------------------------------

Implementa un programa que vaya escribiendo líneas de texto en un archivo. 
El archivo se llamará “teclado.txt” y se creará en la raíz del proyecto.

El programa irá solicitando líneas de texto al usuario (cada línea termina 
con un salto de línea , ‘\n’) y las irá escribiendo en el fichero. Cuando 
en una nueva línea el usuario introduzca el texto “EOF”, el programa 
terminará y esa línea no se escribirá en el fichero. Controla las posibles 
excepciones que pudieran ocurrir.

--------------------------------------------------------------------------------
*/



public class ejer2 {
    public static void main(String[] args) {
        
        String idFichero = "teclado.txt";
        String texto;
        Scanner teclado = new Scanner(System.in);
        
        
        //fichero
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            
            do {
            
            System.out.println("Escribe algo");
            texto = teclado.next();
            
                if (!(texto.equalsIgnoreCase("EOF"))) { //cuando se escribe EOF mete el salto de linea
                    flujo.write(texto+"\n");
                }
                
            } while (!(texto.equalsIgnoreCase("EOF")));

            //flush guarda en el disco duro
            flujo.flush();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        
        
        
        
    }
}

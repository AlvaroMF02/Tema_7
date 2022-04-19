package ejer3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alvaro
 */

/*
--------------------------------------------------------------------------------

Implementa un programa que guarde exactamente 75 líneas de texto en un fichero, 
cuyo nombre se deja a tu elección. En cada línea se irán generando letras 
aleatorias (entre la ‘a’ y la ‘Z’) y se irán separando por punto y coma (;) 
hasta que la letra que se vaya a escribir sea ‘g’ o ‘G’. En este caso, 
se escribe y se saltará a la línea siguiente. 

Posibles ejemplos de líneas generadas:
        a;C;T;B;D;s;u;i;w;g
	Q;w;e;r;t;y;S;H;J;K;G

--------------------------------------------------------------------------------
*/
public class ejer3 {
    public static void main(String[] args) {
        
        //String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String idFichero = "ejer3";
        String[] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z",
                           "A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        
        for (String letra : letras) {
            System.out.println(letra);
        }
        
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))){
            
            for (int i = 0; i < 75; i++) {
                for (int j = 0; j < letras.length; j++) {
                    if (!(letras[i].equalsIgnoreCase("q"))) {
                        System.out.println(letras[i]+";");
                    }else{
                        System.out.println("\n");
                    }
                }
            }
            
            
            flujo.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
        
        
        /*
                                    Random alea = new Random();
                            int num;
            
                for (int i = 0; i < 75; i++) {           //maquina = numAleatorio.nextInt(DEDOS10 - DEDOS0 + 1) + DEDOS0;
                    num=alea.nextInt(53);
                    if (!(letras[num].equalsIgnoreCase("q"))) {
                        System.out.print(letras[i]+";");
                    }else{
                        System.out.println("\n");
                    }
                }
        */
        
    }
}

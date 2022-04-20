package ejer3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

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
        Random alea = new Random();
        int contador=0;
        String tmp;
        String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String idFichero = "ejer3";    
        
        
            //no está bien hecho, solo muestr las g
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))){     
                

                do{
                    int posi = alea.nextInt(letras.length());
                    char letrilla = letras.charAt(posi);    //Pasa la posicion a char
                    tmp = String.valueOf(letrilla); //pasa el char a String
                    
                    if(tmp.equalsIgnoreCase("g")){
                        flujo.write(tmp + ";");
                        flujo.newLine();
                    }else{
                        contador--;
                    }
                    
                    contador++;
                    
                }while(contador<=75);
                

            flujo.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
}

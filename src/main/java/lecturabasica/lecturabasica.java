package lecturabasica;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Álvaro
 */
public class lecturabasica {
    public static void main(String[] args) {
        
        System.out.println(leerTxt("matriz.txt"));
        
    }
    
    public static String leerTxt(String direccion){
        
        String texto = "";  //donde se va a guardar el texto
        
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            
            while ((bfRead = bf.readLine()) != null) { //hace el ciclo hasta que no haya lineas    
                temp = temp + bfRead;   //concatena lo que hay en el archivo 
            }
            
            texto = temp;
            
        } catch (Exception e) {
            //Salida si no se puede abrir el archivo
            System.out.println("No se encontó el archivo");
        }
        
        return texto;
        
    }
}

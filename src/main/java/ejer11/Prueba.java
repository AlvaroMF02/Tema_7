package ejer11;

import java.util.ArrayList;


public class Prueba {
    public static void main(String[] args) {
        
        ArrayList<App> listaApps = new ArrayList<>();
        
        //crea 50 apps
        for (int i = 0; i < 50; i++) {
            App a1 = new App();
            listaApps.add(a1);
        }
        
        for (App p : listaApps) {
            System.out.println(p);
        }
        
        // EN CONSTRUCCION \\
        
    }
}

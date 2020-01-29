package fluxos;

import java.io.File;


public class Fitxers {

    public static void main(String[] args) {
        // Creem un objecte File
        File fitxer = new File("fitxers/sortida1.txt");
        // Mètodes
        System.out.println("Existeix? " + fitxer.exists());
        System.out.println("Fitxer? " + fitxer.isFile());
        System.out.println("Directori? " + fitxer.isDirectory());
        System.out.println("Longitud? " + fitxer.length());
        
        File fitxer2 = new File("fitxers/exemple2.txt");
        try {
            fitxer2.createNewFile();
        } catch (Exception e){
            System.out.println("No s'ha pogut realitzar l'operació");
        }
        
        File directori = new File("fitxers/");
        for (int i=0; i<directori.list().length; i++){
            System.out.println(directori.list()[i]);
        }
    }
    
}

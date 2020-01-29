
package fluxos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SortidaFitxer {

    public static void main(String[] args) {
        
        // Classe PrintStream
        PrintStream ps1 = null;
        try {
            ps1 = new PrintStream("fitxers/sortida1.txt");
            ps1.println("Text exemple 1"); // Sempre sobreescriu el contingut anterior
            System.out.println("Escriptura correcta");
        } catch (FileNotFoundException ex){
            // Excepció per si la ruta del fitxer no existeix
            System.out.println(ex.getClass().getName());
        } finally {
            // En qualsevol cas tanquem el fitxer
            if (ps1!=null) ps1.close();
        }
        
        // Classe PrintStream a partir de Java 7
        // Es tanca el flux automàticament
        try (PrintStream ps2 = 
                new PrintStream("fitxers/sortida2.txt")){
            ps2.println("Text exemple 2"); // Sempre sobreescriu el contingut anterior
            System.out.println("Escriptura correcta");
        } catch (FileNotFoundException ex){
            System.out.println(ex.getClass().getName());
        }
        
        // Classe FileOutputStream
        // Permet afegir dades al fitxer
        try (FileOutputStream fos = 
                new FileOutputStream("fitxers/sortida2.txt", true);
                // mode append true
                PrintStream ps3 = new PrintStream(fos);){
            ps3.println("Text exemple 3");
            System.out.println("Escriptura correcta");
            
        } catch (Exception ex){
            System.out.println(ex.getClass().getName());
        }
    }
    
}

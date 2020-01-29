// Exemple de captura d'excepcions

package excepcions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exemple1 {

    public void inici(String fitxer) {
        try {
            System.out.println("Exemple 1: Obrir un fitxer");
            InputStream in = new FileInputStream(fitxer);
            System.out.println("Fitxer obert");
            int data = in.read();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getClass().getName());
            System.out.println("Excepció 1 de l'exemple 1");
        } catch (IOException e){
            System.out.println(e.getClass().getName());
            System.out.println("Excepció 2 de l'exemple 2");
        }
    }
}

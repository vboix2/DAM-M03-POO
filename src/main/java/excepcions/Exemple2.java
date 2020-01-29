// Exemple de delegació d'excepcions

package excepcions;

import java.io.FileInputStream;
import java.io.InputStream;

public class Exemple2 {
    
    public void inici() throws Exception{
        System.out.println("Exemple 2: Obrir un fitxer");
        InputStream in = new FileInputStream("missingfile.txt");
        System.out.println("Fitxer obert");
        int data = in.read();
        in.close();
    }
}


package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Exemples {

    public static void main(String[] args) {
        // Exemple 1
        // Compilem l'expressió regular
        Pattern p = Pattern.compile("[0-9]{8}[A-Z]");
        // Creem l'objecte Matcher
        Matcher m = p.matcher("12345678A");
        // Avaluem el resultat
        System.out.println(m.matches());
        System.out.println(p.matcher("12345678XY").matches());
        System.out.println(p.matcher("1234567Z").matches());
        
        // Exemple 2
        Pattern p2 = Pattern.compile("E");
        Matcher m2 = p2.matcher("SEGON EXEMPLE");
        // Avalua si conté l'expressió
        System.out.println(m2.find());
        // Cerca i sobreescriu
        String r2 = m2.replaceAll("3");
        System.out.println(r2);
        
    }
    
}

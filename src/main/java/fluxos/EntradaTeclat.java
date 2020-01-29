package fluxos;

import java.util.Scanner;

public class EntradaTeclat {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Lectura de text
        System.out.println("Lectura text:");
        String s = lector.next();
        System.out.println("Text: " + s);
        
        // Lectura de caràcters
        System.out.println("Lectura caràcter:");
        char c = lector.next().charAt(0);
        System.out.println("Text: " + c);
        
        // Lectura d'enters
        System.out.println("Lectura enter:");
        try{
            int n = lector.nextInt();
            System.out.println("Text: " + n);
        } catch (Exception ex){
            System.out.println("Valor incorrecte");
        }
       
        // Lectura d'enters com a text
        System.out.println("Lectura enter com a text:");
        String x = lector.next();
        System.out.println("Text (string): " + x);
        try{
            int m = Integer.parseInt(x);
            System.out.println("Text (enter): " + m);
        } catch (Exception ex){
            System.out.println("Valor incorrecte");
        }
        
        // Lectura de nombres decimals
        System.out.println("Lectura decimals:");
        try{
            float f = lector.nextFloat();
            System.out.println("Text: " + f);
        } catch (Exception ex){
            System.out.println("Valor incorrecte");
        }
        
    }
    
}

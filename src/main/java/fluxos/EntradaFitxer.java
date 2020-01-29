package fluxos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EntradaFitxer {

    public static void main(String[] args) {
        // Classe BufferedReader
        // Requereix un objecte FileReader
        try (FileReader fr = new FileReader("fitxers/sortida1.txt");
                BufferedReader bf = new BufferedReader(fr);){
            
            String s;
            while((s=bf.readLine())!=null){
                System.out.println(s);
            }
            
        } catch(FileNotFoundException ex){
            System.out.println("Fitxer inexistent");
        } catch(IOException ex){
            System.out.println("Error de lectura");
        }
    }
    
}

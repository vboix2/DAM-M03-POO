package colleccions;

import java.util.Collection;
import java.util.HashMap;

public class Taules {

    public static void main(String[] args) {

        //Creació d'una taula
        HashMap<Integer, String> prefix = new HashMap<>();
        
        //Afegir dades a la col·lecció
        prefix.put(93, "Barcelona");
        prefix.put(972, "Girona"); 
        prefix.put(977, "Tarragona");
        
        //Obtenir un valor a partir de la clau
        prefix.get(93);
        
        //Mida de la taula
        prefix.size();
        
        //Eliminar un element, per clau
        prefix.remove(972); // Retorna l'element eliminat "Girona"
        
        //Buscar elements
        prefix.containsKey(0); //Indica si la clau està lliure
        prefix.containsValue("Girona"); //Indica si existeix l'element
        
        //Iterar la taula
        // Construim una col·lecció amb tots els valors
        Collection<String> comarques = prefix.values();
        // Iterem la col·lecció
        for(String s:comarques){
            System.out.println(s);
        }
        
    }
    
}

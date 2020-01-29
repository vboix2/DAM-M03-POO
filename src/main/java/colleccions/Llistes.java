package colleccions;

import java.util.ArrayList;

public class Llistes {

    public static void main(String[] args) {
        
        // Creació de llistes
        ArrayList<String> noms = new ArrayList<>();
        ArrayList<Integer> notes = new ArrayList<>();
        
        //Afegir un valor al final
        noms.add("Victor"); //Posició 0
        noms.add("Xavier"); // Posició 1
        
        //Afegir un valor a la posició especificada
        noms.add(1,"Joan"); // Desplaça Xavier a 2
        
        //Substitueix un element
        noms.set(0, "Jordi"); //Substitueix Victor per Jordi
        
        //Mostra la mida
        noms.size(); //Indica el nombre d'elements
        
        //Torna l'element indicat a la posició
        noms.get(1);
        
        //Eliminar un element
        noms.remove(2); // Elimina Xavier
        
        //Iterar la llista
        for(int i=0; i<noms.size();i++){
            System.out.println(noms.get(i));
        }
        
        for(String s:noms){
            System.out.println(s);
        }
       
    }
    
}

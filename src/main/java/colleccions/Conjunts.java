package colleccions;

import java.util.HashSet;

public class Conjunts {

    public static void main(String[] args) {

        //Creació d'un conjunt
        HashSet<Double> notes = new HashSet<>();

        //Afegir elements
        notes.add(8.5);
        notes.add(4.9);
        notes.add(5.8);
        
        //Eliminar element
        
        //Mida
        notes.size();
        
        //Cerca
        notes.contains(8.5); //Retorna true/false si existeix l'element
        
        //Iterar el conjunt
        Double mitjana=0.;
        for(Double d:notes){
            mitjana += d;
        }
        System.out.println(mitjana/notes.size());
    }
    
}

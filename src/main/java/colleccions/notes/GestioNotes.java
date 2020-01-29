package colleccions.notes;

import java.util.ArrayList;

public class GestioNotes {
    private ArrayList<Double> notes = new ArrayList<>();
    public void afegirNota(double nota){
        notes.add(nota);
    }
    public double mitjanaNotes(){
        double mitjana=0;
        for (double nota:notes){
            mitjana+=nota;
        }
        return mitjana/notes.size();
    }
    public int aprovats(){
        int aprovats=0;
        for (double nota:notes){
            if (nota>=5) aprovats++;
        }
        return aprovats;
    }
    
}

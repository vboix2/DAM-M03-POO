package colleccions.peces;

import java.util.Date;
import java.util.HashSet;


public class gestorPeces {
    private HashSet<Peca> peces=new HashSet<>();
    public void afegir(String nom, Date data){
        peces.add(new Peca(nom, data));
    }
    public void afegir(String nom){
        peces.add(new Peca(nom, new Date()));
    }
    public HashSet<Peca> cercaAntigues(Date data){
        HashSet<Peca> antigues=new HashSet<>();
        for(Peca p:peces){
            if(p.getData().before(data)){
                antigues.add(p);
            }
        }
        return antigues;
    }
}

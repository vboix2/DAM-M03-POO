package colleccions.agenda;

import java.util.Collection;
import java.util.HashMap;


public class GestioAgenda {
    HashMap<String,Contacte> agenda=new HashMap<>();
    
    public boolean afegirContacte(String nom, String email, int edat){
        if(!agenda.containsKey(email)){
            Contacte c=new Contacte(nom, email, edat);
            agenda.put(email, c);
            return true;
        } else return false;
    }
    public Contacte buscarContacte(String email){
        if(agenda.containsKey(email)) return agenda.get(email);
        else return null;
    }
    public boolean eliminarContacte(String email){
        if(agenda.containsKey(email)){
            agenda.remove(email);
            return true;
        } else return false;
    }
    public Contacte[] recuperarContactes(){
        Contacte[] existents=new Contacte[agenda.size()];
        Collection<Contacte> valors=agenda.values();
        int i=0;
        for(Contacte c:valors){
            existents[i]=c;
            i++;
        }
        return existents;
    }
}

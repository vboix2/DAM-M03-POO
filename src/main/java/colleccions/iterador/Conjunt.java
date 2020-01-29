package colleccions.iterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Conjunt implements Iterable<Element>, Iterator<Element>{
    private ArrayList<Element> llista;
    private int posicio=0;
    
    public void afegir(Element e){
        llista.add(e);
    }
    
    @Override
    public Iterator<Element> iterator(){
        return this;
    }
    
    @Override
    public boolean hasNext(){
        if(posicio<llista.size()) return true;
        else return false;
    }
    
    @Override
    public Element next(){
        if (posicio==llista.size()) throw new NoSuchElementException();
        posicio++;
        return llista.get(posicio-1);
    }

}

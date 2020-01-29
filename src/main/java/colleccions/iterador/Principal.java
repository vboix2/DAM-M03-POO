package colleccions.iterador;

import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
        Conjunt llista = new Conjunt();
         
        for (int i=0; i<10; i++){
            llista.afegir(new Element(i));
        }
        
        Iterator<Element> it = llista.iterator();
        
        while(it.hasNext()){
            it.next().imprimir();
        }
        
    }
    
}

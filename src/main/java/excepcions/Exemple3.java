// Exemple de llançament d'excepció personalitzada

package excepcions;

public class Exemple3 {
    
    public void inici(boolean exc) throws Problema{
        System.out.println("Exemple 3");
        if (exc){
            Problema x = new Problema();
            throw x;
        } else {
            System.out.println("Tot correcte");
        }
    }   
}

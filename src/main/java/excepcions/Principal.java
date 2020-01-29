// Exemples d'excepcions

package excepcions;

public class Principal {

    public static void main(String[] args) {
        
        // Captura d'excepcions al mètode
        Exemple1 ex1 = new Exemple1();
        ex1.inici("missingfile.txt");
        
        // Delegació d'excepcions
        Exemple2 ex2 = new Exemple2();
        try {
            ex2.inici();
        } catch (Exception ex) {
            System.out.println("Excepció de l'exemple 2");
        }
        // Excepcions personalitzades
        Exemple3 p = new Exemple3();
        try {
            p.inici(true);
        } catch (Problema e){
            System.out.println(e.mostra());
        }
    }

}

package fonaments;


public class Principal {

    public static void main(String[] args) {
        // Creem dos objectes de la classe Compte
        Compte c1 = new Compte("Víctor", 1000);
        Compte c2 = new Compte("Joan");
        
        // Mostrem informació dels comptes
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        // Apliquem els mètodes
        c2.ingressar(200);
        c1.retirar(50);
        
        // Mostrem els canvis
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
    
}

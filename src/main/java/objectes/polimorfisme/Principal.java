package objectes.polimorfisme;

public class Principal {

    public static void main(String[] args) {
        
        // Exemple de polimorfisme
        Figura f = new Cercle(2, "verd");
        System.out.printf("Superfície del cercle %s: %.2f\n",f.getColor(),f.superficie());
        
        f = new Quadrat(2, "groc");
        System.out.printf("Superfície del quadrat %s: %.2f\n",f.getColor(),f.superficie());
    }
    
}

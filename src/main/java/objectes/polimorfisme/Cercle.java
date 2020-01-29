
package objectes.polimorfisme;

public class Cercle extends Figura {
    private int radi;

    public Cercle(int radi, String color) {
        super(color);
        this.radi = radi;
    }
    
    // Implementació del mètode abstracte
    @Override  // Sobreescriptura obligada
    public double superficie(){
        return Math.PI * radi * radi;
    }
    
}

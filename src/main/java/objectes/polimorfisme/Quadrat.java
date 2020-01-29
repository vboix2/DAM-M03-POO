package objectes.polimorfisme;

public class Quadrat extends Figura {
    private int costat;

    public Quadrat(int costat, String color) {
        super(color);
        this.costat = costat;
    }
    
    // Implementació del mètode abstracte
    @Override  // Sobreescriptura obligada
    public double superficie(){
        return costat*costat;
    }
    
}
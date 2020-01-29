
package objectes.polimorfisme;

public abstract class Figura {
    private String color;
    
    public Figura(String color){
        this.color = color;
    }
    
    // Declaració d'un mètode abstracte
    public abstract double superficie();

    public String getColor() {
        return color;
    }
    
}

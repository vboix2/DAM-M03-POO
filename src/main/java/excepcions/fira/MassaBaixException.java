
package excepcions.fira;

public class MassaBaixException extends Exception {
    private int alcada;

    public MassaBaixException(int alcada) {
        this.alcada = alcada;
    }
    
    @Override
    public String toString () {
        return " és massa baix: " + alcada + " cm";
    }
    
}

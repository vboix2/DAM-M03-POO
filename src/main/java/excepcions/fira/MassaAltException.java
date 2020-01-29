
package excepcions.fira;

public class MassaAltException extends Exception {
    private int alcada;

    public MassaAltException(int alcada) {
        this.alcada = alcada;
    }
    
    @Override
    public String toString () {
        return " és massa alt: " + alcada + " cm";
    }
    
}

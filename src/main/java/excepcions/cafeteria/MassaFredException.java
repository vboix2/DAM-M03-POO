
package excepcions.cafeteria;

public class MassaFredException extends Exception {
    final private Integer temperatura;
    
    public MassaFredException(int temperatura){
        this.temperatura=temperatura;
    }    
    
    @Override
    public String toString () {
        return "El cafè és massa fred, " + temperatura + " graus.";
    }

    
    
}

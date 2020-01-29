
package excepcions.cafeteria;

public class MassaCalentException extends Exception {
        final private Integer temperatura;
    
    public MassaCalentException(int temperatura){
        this.temperatura=temperatura;
    }    
    
    @Override
    public String toString () {
        return "El cafè és massa calent, " + temperatura + " graus.";
    }


}

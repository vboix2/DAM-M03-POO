
package excepcions.cafeteria;

public class Client {
    
    private int taula;

    public Client(int taula){
        setTaula(taula);
    } 
    
    public String beureCafe(TassaCafe tassaCafe) throws MassaFredException, MassaCalentException{
        // Obtenim la temperatura del cafè
        int temp = tassaCafe.getTemperatura();
        
        if (temp < 60) {
            // Si és massa fred llencem la excepció MassaFred
            throw new MassaFredException(temp); 
        } else if (temp > 80) {
            // Si és massa calent llencem la excepció MassaCalent
            throw new MassaCalentException(temp);             
        }
        // Si la temperatura és correcta es mostra el text
        return "Taula "+taula+": És un cafè excel·lent!";
    }
    
    public int getTaula() {
        return taula;
    }

    public final void setTaula(int taula) {
        this.taula = taula;
    }
    
}

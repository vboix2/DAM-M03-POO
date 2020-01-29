
package excepcions.cafeteria;

public class TassaCafe {
    private int temperatura;
    
    public TassaCafe(){
        setTemperatura(temperatura);
    }

    public int getTemperatura() {
        return temperatura;
    }

    public final void setTemperatura(int temperatura) {
        // Temperatura aleatòria entre 50 i 90 graus
        this.temperatura = (int) (Math.random() * 41) + 50 ;
    }
    
}

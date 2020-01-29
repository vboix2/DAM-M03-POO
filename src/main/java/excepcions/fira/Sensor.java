
package excepcions.fira;

import java.util.Random;

public class Sensor {
    private Random r;

    public Sensor() {
        r = new Random();        
    }

    public int obtenirAlcada() {        
        return r.nextInt(86) + 130;
    }
     
}

package excepcions.fira;

public class AtraccioFires {

    public static void main(String[] args) {
        // Creem l'objecte porta d'entrada
        PortaEntrada porta = new PortaEntrada();
        // Creem el sensor
        Sensor s = new Sensor();
        
        for (int i=1; i<=20; i++) {
            try {
                // Comprovem l'alçada de la persona
                System.out.println("El client " + i + porta.comprovar(s));
            } catch(MassaAltException | MassaBaixException ex) {
                // Si no pot entrar llencem l'excepció
                System.out.println("El client "+ i + ex);
            } 
        }
    }
    
}

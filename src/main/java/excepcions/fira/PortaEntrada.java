
package excepcions.fira;

public class PortaEntrada {
    
    public String comprovar(Sensor s) throws MassaAltException, MassaBaixException{
        int alcada = s.obtenirAlcada();
        
        if (alcada>190){
            throw new MassaAltException(alcada);
            
        } else if (alcada<150){
            throw new MassaBaixException(alcada);
        }
        return " pot passar";
    } 
}

// Excepció personalitzada extenent la classe Exception

package excepcions;

public class Problema extends Exception{
    public String mostra() {
        return "Tenim un problema!";
    }
    
}

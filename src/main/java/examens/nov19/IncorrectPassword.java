
package examens.nov19;

public class IncorrectPassword extends Exception{
    
    public void show(){
        System.err.println("Weak password!");
    }
}

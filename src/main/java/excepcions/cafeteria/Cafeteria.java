package excepcions.cafeteria;

public class Cafeteria {
    
    public static void main(String[] args) {
        
        for (int i=1; i<=20; i++) {
            Client client = new Client(i);
            TassaCafe tassaCafe = new TassaCafe();
        
            try {
                System.out.println(client.beureCafe(tassaCafe));
            } catch(MassaFredException | MassaCalentException ex) {
                System.out.print("Taula "+ i +": ");
                System.out.println(ex);
            } 
        }
    }
    
}

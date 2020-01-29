package objectes.herencia;

public class Principal {

    public static void main(String[] args) {
        // Creem un objecte Persona (constructor 3)
        Persona joan = new Persona("Joan", 'H', 25, 70, 1.8);
        
        // Mètodes de Persona
        System.out.println(joan.toString());
        System.out.println(joan.esMajorDEdat());
        System.out.println(joan.calcularIMC() + "\n");
        
        
        // Creem un objecte Persona (constructor 2)
        Persona nuria = new Persona("Núria", 'D', 8);
        
        // Assignem els atributs que falten
        nuria.setPes(30);
        nuria.setAltura(1.3);
        
        // Mètodes de Persona
        System.out.println(nuria.toString());
        System.out.println(nuria.esMajorDEdat());
        System.out.println(nuria.calcularIMC() + "\n");
        
        
        // Creem un objecte Alumne
        Alumne jordi = new Alumne(8,5,6,"Jordi", 'H', 22);
        jordi.setPes(65.6);
        jordi.setAltura(1.8);
        
        // Mètodes de Persona
        System.out.println(jordi.esMajorDEdat());
        System.out.printf("IMC = %.2f\n", jordi.calcularIMC());
        
        // Mètodes de Alumne
        System.out.println(jordi.calculaMitjana());
        System.out.println(jordi.toString());
    }
    
}

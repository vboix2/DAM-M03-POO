package objectes.herencia;


public class Alumne extends Persona {
    
    // Atributs
    private double nota1;
    private double nota2;
    private double nota3;
    
    //Inicialitzadors
    {
        System.out.println("S'ha creat un objecte de la classe Alumne");
    }
    
    //Constructors
    public Alumne(double nota1, double nota2, double nota3, String nom, char sexe, int edat) {
        super(nom, sexe, edat);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    // Mètodes
    @Override  // Sobreescriptura del mètode de la superclasse
    public String toString() {
        return "ALUMNE: " + this.getNom() + "\nNota 1 = " + nota1 +
                "\nNota2 = " + nota2 + "\nNota3 = " + nota3 + "\n";
    }

    public double calculaMitjana(){
        return (nota1+nota2+nota3)/3;
    }
}

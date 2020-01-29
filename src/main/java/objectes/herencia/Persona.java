package objectes.herencia;


public class Persona {
    
    // Atributs
    private String nom;
    private char sexe;
    private int edat;
    private double pes;
    private double altura;
    
    // Inicialitzador
    {
        System.out.println("S'ha creat un objecte de la classe Persona");
    }
    
    // Constructors
    public Persona(){
        this("",'H',0 ,0 , 0);
    }
    public Persona(String nom, char sexe, int edat) {
        this(nom, sexe, edat, 0, 0);
    }
    public Persona(String nom, char sexe, int edat, double pes, double altura) {
        this.nom = nom;
        this.sexe = sexe;
        this.edat = edat;
        this.pes = pes;
        this.altura = altura;
    }

    // Mètodes
    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "PERSONA\n" + "Nom: " + nom + "\nSexe: " + sexe + "\nEdat: " +
                edat + "\nPes: " + pes + "\nAltura: " + altura;
    }    
    
    public double calcularIMC() {        
        return pes/(altura*altura);
    }
    
    public boolean esMajorDEdat(){
        if (edat<18) return false;
        else return true;
    }
    
}

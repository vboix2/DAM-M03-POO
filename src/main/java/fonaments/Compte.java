package fonaments;


public class Compte {
    
    // Atributs
    private String titular;
    private double quantitat;
    
    // Inicialitzador
    {
        System.out.println("S'ha creat un compte");
    }
    
    // Constructors
    public Compte(String titular){
        this(titular,0);
    }
    public Compte(String titular, double quantitat){
        this.titular=titular;
        if (quantitat<0){
            this.quantitat=0;
        } else {
            this.quantitat = quantitat;
        }
    }
    
    // Mètodes
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(double quantitat) {
        this.quantitat = quantitat;
    }

    @Override
    public String toString() {
        return "El titular " + titular + " té " + quantitat + " euros al compte.";
    }
    public void retirar(double q){
        if (this.quantitat-q>=0){
            this.quantitat -= q;
        }
    }
    public void ingressar(double q){
        if (q>0) this.quantitat += q;
    }
    
}

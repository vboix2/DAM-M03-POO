package colleccions.agenda;


public class Contacte {
    private String nom;
    private String email;
    private int edat;
    
    public Contacte(String n, String em, int e){
        this.nom=n;
        this.email=em;
        this.edat=e;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }
    public void imprimirContacte(){
        System.out.println("Nom: " + this.nom);
        System.out.println("Correu: " + this.email);
        System.out.println("Edat: " + this.edat);
    }
}

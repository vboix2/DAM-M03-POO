package fluxos.agenda;


public class Contacte {
    private String nom;
    private String telefon;
    private String correu;

    public Contacte(String nom, String telefon, String correu) {
        this.nom = nom;
        this.telefon = telefon;
        this.correu = correu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }
    
    public void imprimir(){
        System.out.println("Nom: "+ nom);
        System.out.println("Telèfon: " + telefon);
        System.out.println("Correu electrònic: "+ correu);
        System.out.println("--------------------------");
    }
}

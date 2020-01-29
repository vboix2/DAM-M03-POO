package colleccions.peces;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class Peca {
    private String nom;
    private Date data;

    public Peca(String nom, Date data) {
        this.nom = nom;
        this.data = data;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    public void imprimir(){
        DateFormat df=DateFormat.getDateInstance(DateFormat.FULL, new Locale("ES", "es"));
        
        System.out.println("Nom: "+this.nom);
        System.out.println("Data: "+df.format(this.data));
        System.out.println("-----------------");
    }
}

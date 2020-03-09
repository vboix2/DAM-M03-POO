
package bbdd.scraping;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Noticia")
public class Noticia implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @Column(name="titol")
    private String titol;
    
    @Column(name="autor")
    private String autor;
    
    @Column(name="data")
    private String data;


    public Noticia(String titol, String autor, String data) {
       this.titol = titol;
       this.autor = autor;
       this.data = data;
    }

    public String getTitol() {
        return titol;
    }
    
    @Override
    public String toString() {
        return "Títol: " + titol + "\nAutor: " + autor + "\nData: " + data +"\n";
    }
}

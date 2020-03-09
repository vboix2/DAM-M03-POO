
package bbdd.hibernate;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contacte")
public class Contacte implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    
    @Column(name="nom")
    String nom;
    
    @Column(name="telefon")
    String telefon;
    
    @Column(name="email")
    String email;

    public Contacte(String nom, String telefon, String email) {
        this.nom = nom;
        this.telefon = telefon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Noticia{" + "id=" + id + ", nom=" + nom + ", telefon=" + telefon + ", email=" + email + '}';
    }
    
    
}

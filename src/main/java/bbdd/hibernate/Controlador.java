package bbdd.hibernate;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Controlador {

    private Session sesion;

    public Controlador() {
        sesion = HibernateUtil.getSessionFactory().openSession();
    }

    public int inserta(Contacte contacte) {
        int id = 0;
        Transaction tx = sesion.beginTransaction();
        id = (int) sesion.save(contacte);
        tx.commit();
        return id;
    }

    public void actualitza(Contacte contacte) {
        Transaction tx = sesion.beginTransaction();
        sesion.update(contacte);
        tx.commit();
    }

    public void elimina(Contacte contacte) {
        Transaction tx = sesion.beginTransaction();
        sesion.delete(contacte);
        tx.commit();
    }

    public Contacte cerca(int id) {
        Contacte contacte = (Contacte) sesion.get(Contacte.class, id);
        return contacte;
    }

    public ArrayList<Contacte> cercaTots() {
        ArrayList<Contacte> llista =  new ArrayList(sesion.createQuery("from Contacte").list());
        return llista;
    }

    public void tanca() {
        sesion.close();
    }
}

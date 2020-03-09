package bbdd.scraping;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Controlador {

    private Session sesion;

    public Controlador() {
        sesion = NewHibernateUtil.getSessionFactory().openSession();
    }

    public int inserta(Noticia noticia) {
        Transaction tx = sesion.beginTransaction();
        int id = (int) sesion.save(noticia);
        tx.commit();
        return id;
    }

    public void tanca() {
        sesion.close();
    }
}

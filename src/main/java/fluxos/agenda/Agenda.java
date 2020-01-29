package fluxos.agenda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;


public class Agenda {

    private int nombre;
    private Contacte contactes[];
    private File fitxer;

    public Agenda(File fitxer) {
        this.fitxer = fitxer;
        this.contactes = new Contacte[20];
        try (FileReader fr = new FileReader(fitxer);
                BufferedReader bf = new BufferedReader(fr);) {
            String s;
            int i = 0;
            while ((s = bf.readLine()) != null) {
                String contacte[] = s.split("[|]");
                contactes[i] = new Contacte(contacte[0],contacte[1],contacte[2]);
                i++;
            }
            this.nombre = i;

        } catch (IOException ex) {
            System.out.println("Problema obrint el fitxer");
        }

    }

    public int getNombre() {
        return nombre;
    }

    public Contacte getContacte(int c) {
        return contactes[c];
    }

    public void afegirContacte(String nom, String telefon, String correu) {
        contactes[nombre] = new Contacte(nom, telefon, correu);
        nombre++;
    }

    public int buscarContacte(String nom) {
        for (int i = 0; i < nombre; i++) {
            if (contactes[i].getNom().equals(nom)) {
                return i;
            }
        }
        return -1;
    }

    public void imprimir() {
        for (int i = 0; i < nombre; i++) {
            contactes[i].imprimir();
        }
    }

    public void guardar() {
        try (PrintStream ps
                = new PrintStream(fitxer)) {
            if (nombre > 0) {
                for (int i=0; i<nombre; i++) {
                    ps.println(contactes[i].getNom() + "|" 
                            + contactes[i].getTelefon() 
                            + "|" + contactes[i].getCorreu());
                }
                System.out.println("Fitxer guardat correctament");
            }
        } catch (Exception ex) {
            System.out.println(ex.getClass().getName());
        }
    }
    
    public void eliminar(int n){
        for (int i=n; i<nombre-1; i++){
            contactes[i]=contactes[i+1];
        }
        nombre--;
    }
}

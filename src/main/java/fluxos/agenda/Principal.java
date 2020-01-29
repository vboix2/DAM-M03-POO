package fluxos.agenda;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        int op = 0;
        File fitxer = new File("fitxers/agenda.txt");
        if (!fitxer.exists()) try {
            fitxer.createNewFile();
        } catch (IOException ex) {
            System.out.println("Problema amb el fitxer");
            op = 4;
        }
        Agenda ag = new Agenda(fitxer);
        Scanner lector = new Scanner(System.in);
        System.out.println("···AGENDA···");
        do {
            System.out.println("Tria una opció:");
            System.out.println("\t1. Afegir un contacte");
            System.out.println("\t2. Cerca un contacte");
            System.out.println("\t3. Imprimir agenda");
            System.out.println("\t4. Eliminar contacte");
            System.out.println("\t5. Sortir");

            try {
                op = Integer.parseInt(lector.nextLine());
            } catch (Exception ex) {
                System.out.println("Opció no vàlida!");
            }

            switch (op) {
                case 1:
                    System.out.println("Indica el nom:");
                    String nom = lector.nextLine();
                    System.out.println("Indica el telèfon:");
                    String telefon = lector.nextLine();
                    System.out.println("Indica el correu:");
                    String correu = lector.nextLine();
                    ag.afegirContacte(nom, telefon, correu);
                    System.out.println("Contacte afegit correctament.");
                    break;

                case 2:
                    System.out.println("Indica el nom:");
                    String n = lector.nextLine();
                    int c = ag.buscarContacte(n);
                    if (c==-1){
                        System.out.println("Contacte no trobat");
                    } else {
                        ag.getContacte(c).imprimir();
                    }
                    break;

                case 3:
                    ag.imprimir();
                    break;
                
                case 4:
                    System.out.println("Indica el nom:");
                    String n4 = lector.nextLine();
                    int c4 = ag.buscarContacte(n4);
                    ag.eliminar(c4);
                    break;
            }
        } while (op != 5);
        ag.guardar();
    }
}

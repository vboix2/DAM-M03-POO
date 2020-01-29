package colleccions.agenda;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        GestioAgenda llibreta = new GestioAgenda();
        Scanner lector=new Scanner(System.in);
        int op=0;
        String nom, email;
        int edat;
        do{
            System.out.println("Escull una opció:");
            System.out.println(" 1. Afegir contacte");
            System.out.println(" 2. Buscar contacte");
            System.out.println(" 3. Eliminar contacte");
            System.out.println(" 4. Mostrar contactes");
            System.out.println(" 5. Sortir");
            op=Integer.parseInt(lector.nextLine());
            switch(op){
                case 1:
                    System.out.println("Introdueix el nom:");
                    nom = lector.nextLine();
                    System.out.println("Introdueix el correu electrònic:");
                    email = lector.nextLine();
                    System.out.println("Introdueix l'edat:");
                    edat = Integer.parseInt(lector.nextLine());
                    if(llibreta.afegirContacte(nom, email, edat)) {
                        System.out.println("Contacte afegit correctament");
                    } else {
                        System.out.println("Contacte ja existent");
                    }
                    break;
                case 2:
                    System.out.println("Indica el correu electrònic:");
                    email=lector.nextLine();
                    llibreta.buscarContacte(email).imprimirContacte();
                    break;
                case 3:
                    System.out.println("Indica el correu electrònic:");
                    email=lector.nextLine();
                    if(llibreta.eliminarContacte(email)){
                        System.out.println("Contacte eliminat");
                    } else {
                        System.out.println("No existeix aquest contacte");
                    }
                    break;
                case 4:
                    Contacte[] valors=llibreta.recuperarContactes();
                    for(Contacte c:valors){
                        c.imprimirContacte();
                        System.out.println("-----------");
                    }
                case 5:
                    break;
                default:
                    System.out.println("Opció incorrecta!");
            }
        } while(op!=5);
    }
    
}

package colleccions.notes;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        GestioNotes notes=new GestioNotes();
        int opt=0;
        double nota;
        do {
            System.out.println("Selecciona una opció:");
            System.out.println(" 1. Introduir nota");
            System.out.println(" 2. Calcular mitjana");
            System.out.println(" 3. Nombre d'aprovats");
            System.out.println(" 4. Sortir");
            opt = Integer.parseInt(lector.nextLine());
            switch (opt){
                case 1: 
                    System.out.println("Introdueix la nota:");
                    nota = Double.parseDouble(lector.nextLine());
                    notes.afegirNota(nota);
                    break;
                case 2:
                    System.out.println("Mitjana: " + notes.mitjanaNotes());
                    break;
                case 3:
                    System.out.println("Aprovats: " + notes.aprovats());
                    break;
            }
        } while(opt!=4);
    }
    
}

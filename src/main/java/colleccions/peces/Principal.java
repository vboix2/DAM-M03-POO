package colleccions.peces;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        gestorPeces gestor=new gestorPeces();
        int opt=0, year, month,day;
        String nom;
        Calendar cal=Calendar.getInstance();
        do{
            System.out.println("1. Afegir peça");
            System.out.println("2. Peces antigues");
            System.out.println("3. Sortir");
            opt=Integer.parseInt(lector.nextLine());
            switch(opt){
                case 1:
                    System.out.println("Nom:");
                    nom=lector.nextLine();
                    System.out.println("Any:");
                    year=Integer.parseInt(lector.nextLine());
                    System.out.println("Mes:");
                    month=Integer.parseInt(lector.nextLine());
                    System.out.println("Dia:");
                    day=Integer.parseInt(lector.nextLine());
                    
                    cal.set(year, month-1,day);
                    gestor.afegir(nom, cal.getTime());
                    break;
                case 2:
                    System.out.println("Any:");
                    year=Integer.parseInt(lector.nextLine());
                    System.out.println("Mes:");
                    month=Integer.parseInt(lector.nextLine());
                    System.out.println("Dia:");
                    day=Integer.parseInt(lector.nextLine());
                    
                    cal.set(year, month-1,day);
                    HashSet<Peca> antigues=gestor.cercaAntigues(cal.getTime());
                    for(Peca a:antigues){
                        a.imprimir();
                    }
                    break;
                case 3:
                    
                default:
            }
        } while(opt!=3);
    }
    
}

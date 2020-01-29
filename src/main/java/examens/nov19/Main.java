package examens.nov19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dictionary g = new Dictionary();
        Scanner reader = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("-------------------------------");
            System.out.println("Password dictionary application");
            System.out.println("-------------------------------");
            System.out.println("Choose an option:");
            System.out.println("  1. Add passwords");
            System.out.println("  2. Show passwords");
            System.out.println("  3. Show dictionary");
            System.out.println("  4. Save");
            System.out.println("  5. Exit");

            boolean isCorrect = false;
            System.out.println("Enter a number");
            do {
                try {
                    option = Integer.parseInt(reader.next());
                    isCorrect = true;
                } catch (Exception ex) {
                    System.err.println("Incorrect number!");
                }
            } while (!isCorrect);

            switch(option){
                case 1:
                    g.addPasswords();
                    break;
                case 2:
                    g.printPasswords();
                    break;
                case 3:
                    g.printDictionary();
                    break;
                case 4:
                    g.savePasswords();
                    break;
            }
        } while(option!=5);
    }
    
}

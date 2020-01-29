package examens.nov19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
    private ArrayList<String> passwords;
    private Scanner reader;
    private String file;

    public Dictionary() {
        this.passwords = new ArrayList<>();
        this.reader = new Scanner(System.in);
        this.file = "fitxers/passwords.txt";
    }
    
    public void addPasswords(){
        String pw = "";
        do {
            System.out.println("Add a new password (write 'end' to end):");
            try {
                pw = readPassword();
                if (!pw.equals("end")){
                    passwords.add(pw);
                }
            } catch (IncorrectPassword ex){
                ex.show();
            }

        } while(!pw.equals("end"));
    }
    
    private String readPassword() throws IncorrectPassword{
        String pw = reader.next();
        if (pw.equals("end")){
            return pw;
        } else if (pw.length()<6 || pw.equals("123456")){
            throw new IncorrectPassword();
        }
        return pw;
    }
    
    
    public void savePasswords(){
        try (FileOutputStream fos = 
                new FileOutputStream(file, true);
                PrintStream ps3 = new PrintStream(fos);){
            for (String s:passwords){
                ps3.println(s);
            }
            System.out.println("Passwords saved correctly.");
            
        } catch (Exception ex){
            System.out.println(ex.getClass().getName());
        }
    } 
    
    public void printPasswords(){
        System.out.print("PASSWORDS:");
        for (String s:passwords){
            System.out.print(" "+s);
        }
        System.out.println();
    }
    
    public void printDictionary(){
        try (FileReader fr = new FileReader(file);
                BufferedReader bf = new BufferedReader(fr);){
            
            System.out.println("PASSWORDS DICTIONARY");
            String s;
            while((s=bf.readLine())!=null){
                System.out.println(s);
            }
            
        } catch(FileNotFoundException ex){
            System.err.println("File not found");
        } catch(IOException ex){
            System.err.println("Reading error");
        }
    }
    
}

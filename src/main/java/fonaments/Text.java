package fonaments;

public class Text {

    public static void main(String[] args) {
        
        // Classe String ------------------
        
        // Creació de cadenes de text
        String s1 = new String("Exemple");
        String s2 = "1";
        
        // Concatenació de cadenes de text
        String s3 = s1 + " " + s2;
        System.out.println(s3);
        
        
        // Classe StringBuilder ------------
        
        // Construcció
        StringBuilder sb = new StringBuilder("Exemple");
        
        // Modificació
        System.out.println(sb.append(" 2"));
        System.out.println(sb.insert(1, "x"));
        System.out.println(sb.delete(3,4));
        System.out.println(sb.substring(2, 5));
        
        // Altres mètodes
        String s5 = sb.toString();
        System.out.println(sb.length());
        
        // Inversió d'una cadena de text
        System.out.println(invertir("Exemple 3"));

    }
    
    public static String invertir(String text){
        // Mètode per invertir una cadena de text
        
        StringBuilder aux = new StringBuilder("");
        for (int i=text.length()-1; i>=0; i--){
            aux.append(text.charAt(i));
        }
        return aux.toString();
    }
    
}

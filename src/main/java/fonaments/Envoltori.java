package fonaments;

public class Envoltori {

    public static void main(String[] args) {
        
        // Exemples d'encapsulació de tipus primitius
        Integer en = new Integer(300);
        Double ed = new Double(3.14);
        Character ec = new Character('#');
        
        // Recuperació dels tipus primitius
        int n = en.intValue();
        double d = ed.doubleValue();
        char c = ec.charValue();
        
        // Autoboxing. Conversió automàtica
        Integer an = 100;
        int am = an;
        
        // Conversions text-número
        int si = Integer.parseInt("25");
        double sd = Double.parseDouble("3.8");
        
    }
    
}
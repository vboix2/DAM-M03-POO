package colleccions.iterador;

public class Element {
    private int n;

    public Element(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void imprimir(){
        System.out.println(n);
    }
}

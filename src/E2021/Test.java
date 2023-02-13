package E2021;

public class Test {
    public static void main(String[] args) {
        boolean erg;

        A b1 = new B(1);
        A b2 = new B(b1, b1.m);
        erg = b1.gleich(b2);
    }
}
class A {
    protected static int x=1;
    public int m;
    public A(int m){
        this.m = m;
        x++;
    }
    public int get(){ return getM(); }
    public int getM(){ return m; }
    public boolean gleich(A a) {
        return a.m == this.m;
    }
}
class B extends A {
    protected int m;
    protected String matrNr = "000000000";
    public B(int m){
        super(m + 2);
        this.m = m+1;
        x++;
    }
    public B(A a, int m){
        super(a.m + m);
        this.m = a.m;
        x++;
    }
    public int getM(){ return m; }
    public boolean gleich(A a) {
        boolean erg = getM() == a.getM();
// Zeitpunkt 1
        return erg;
    }
}

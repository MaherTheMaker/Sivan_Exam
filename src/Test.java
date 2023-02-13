public class Test {
    public static void main
            (String[] args)
    {



        int n;
        A a = new A(1,2);
        A b = new B(3,4);

        n = b.summe(10);
        System.out.print(n);
    }
}
class A {
    private static int c = 1;
    private int m;
    private int n;

    public A(int m, int n)
    {
        this.m = m;
        this.n = n;
        c++;
    }
    public int summe(int i)
    {
        System.out.println("A");

        int erg;
        erg = m + n + i;
        // Zeitpunkt 1
        return erg;
    }
}
class B extends A {
    private int m;
    public B(int m, int n)
    {
        super(n, m);
        this.m = m + n;
    }
    public int summe(int i)
    {
        System.out.println("B");
        int erg = m;
        erg += super.summe(i);
        return erg;
    }
}
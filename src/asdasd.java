//public class asdasd {
//    public static void main
//            (String[] args)
//    {
//        A a = new A(3);
//        System.out.println("a.m = " + a.m);
//        System.out.println("a.n = " + a.n);
//        System.out.println("A.C = " + A.c);
//        System.out.println("B.C = " + B.c);
//        A b = new B(1,4);
//        System.out.println( ((B)b).m);
//        System.out.println("b.m = " + b.m);
//        System.out.println("B.n = " + b.n);
//
//        System.out.println("A.C = " + A.c);
//        System.out.println("B.C = " + B.c);
//        b.methode(6);
//        System.out.println("b.m = " + b.m);
//        System.out.println("B.n = " + b.n);
//
//        System.out.println("A.C = " + A.c);
//        System.out.println("B.C = " + B.c);
//
//
//    }
//}
//class A {
//    public static int c = 1;
//    public int m;
//    public int n;
//
//    public A(int n)
//    {
//        System.out.println("A");
//        System.out.println("this.m = " + this.m);
//        System.out.println("this.n = " + this.n);
//        m = 5;
//        c += m+n;
//        System.out.println("A after");
//        System.out.println("this.m = " + this.m);
//        System.out.println("this.n = " + this.n);
//    }
//    public void methode(int i)
//    {
//        m -= i;
//        erhoehe(i);
//// Zeitpunkt 1
//    }
//    public void erhoehe(int i)
//    {
//        m += 2*i;
//    }
//}
//class B extends A {
//
//    public int m;
//    public B(int m, int n)
//    {
//
//        super(n);
//        System.out.println("after siper");
//        System.out.println("this.m = " + this.m);
//        System.out.println("this.n = " + this.n);
//        this.m = m + 1;
//        System.out.println("asdasd siper");
//        System.out.println("this.m = " + this.m);
//        System.out.println("this.n = " + this.n);
//    }
//    public void erhoehe(int i)
//    {
//        m += i;
//        super.erhoehe(i);
//    }
//}
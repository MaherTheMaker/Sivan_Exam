import java.util.Scanner;

public class WC {
    public static void main
            (String[] args)
    {
        int pointGermany=0;
        int pointItaly=0;
        int pointNetherlands=0;
        Scanner sc=new Scanner(System.in);
        boolean isDone=false;
        int a,b;
        while (!isDone)
        {
            System.out.println("Italy vs Ger");
            a= sc.nextInt();
            b= sc.nextInt();
            if(a>b){
                pointItaly+=3;
            }
            else if(a==b)
            {
                pointItaly++;
                pointGermany++;
            }
            else {
                pointGermany+=3;
            }
            System.out.println("Italy vs Nether");
            a= sc.nextInt();
            b= sc.nextInt();
            if(a>b){
                pointItaly+=3;
            }
            else if(a==b)
            {
                pointItaly++;
                pointNetherlands++;
            }
            else {
                pointNetherlands+=3;
            }

            System.out.println("Netherlands vs Ger");
            a= sc.nextInt();
            b= sc.nextInt();
            if(a>b){
                pointNetherlands+=3;
            }
            else if(a==b)
            {
                pointNetherlands++;
                pointGermany++;
            }
            else {
                pointGermany+=3;
            }
            System.out.println("pointItaly = " + pointItaly);
            System.out.println("pointGermany = " + pointGermany);
            System.out.println("pointNetherlands = " + pointNetherlands);

            if(pointGermany==pointItaly || pointGermany==pointNetherlands||pointNetherlands==pointItaly)
            {
                pointGermany=0;
                pointNetherlands=0;
                pointItaly=0;
                isDone=false;
            }
            else {
                isDone=true;
            }
        }
    }
}

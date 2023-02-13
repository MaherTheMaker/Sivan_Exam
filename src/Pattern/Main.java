package Pattern;

import EidP_Klausur_09.Test;

public class Main {

        public static void main(String[] args) {
                int a[]={1,2,4,5,6,7};
                int b[]={2,4};
                System.out.println("check(1,a,b) = " + check2(1,a,b));
        }


        public static boolean check(int start, int A[],int B[])
        {

                int x=0;
                while (x<B.length&&A[start+x]==B[x])
                {
                        x++;
                }
                return x>=B.length;
        }

        public static boolean check2(int start, int A[],int B[])
        {

                int x=0;
                boolean found=true;
                while (x<B.length)
                {
                        if(A[start+x]!=B[x])
                        {
                                found =false;
                                break;
                        }
                        x++;
                }
                return found;
        }
        public static boolean check3(int start, int A[],int B[])
        {

                boolean found=true;
                for (int i = 0; i < B.length; i++) {
                        if(A[start+i]!=B[i])
                        {
                                found =false;
                                break;
                        }
                }
                return found;
        }

        public static boolean check4(int start, int A[],int B[])
        {

                int i;
                for ( i = 0; i < B.length; i++) {
                        if(A[start+i]!=B[i])
                        {
                             break;
                        }
                }
                return i>=B.length;
        }



}

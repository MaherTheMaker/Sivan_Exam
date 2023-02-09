package SelectionSort;

public class Main {
    public static void main(String[] args) {

        int a[]={7,2,4,5,6,7};
       int b[]= Ssort(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

    public static int[] Ssort(int feld[])
    {
        for (int i = 0; i < feld.length - 1; i++) {

                    int min=i;
            for (int j = i; j < feld.length ; j++) {
            if(feld[j]<feld[min])
            {
                min=j;
            }
        }

            //swap
            int temp=feld[i];
            feld[i]=feld[min];
            feld[min]=temp;



        }
        return feld;
    }

//    public static int minArray(int start,int feld[])
//    {
//
//        int min=start;
//        for (int i = start; i < feld.length ; i++) {
//            if(feld[i]<feld[min])
//            {
//                min=i;
//            }
//        }
//        return min;
//    }

}

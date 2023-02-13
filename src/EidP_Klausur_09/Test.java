package EidP_Klausur_09;

 class Person {
    private String name;
    private int age;
    private static int nextId = 1;
    private int id;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = nextId++;
    }

    public String toString() {
        return name + ", " + age + " years old";
    }
}

 class Vehicle {
    private String designation;
    private Person owner;

    public Vehicle(String designation, Person owner) {
        this.designation = designation;
        this.owner = owner;
    }

    public String toString() {
        return designation + " with owner " + owner;
    }
}

  public class Test {
     public static void main(String[] args) {
         int a = 6;
         int b = 20;
         int[][] s = {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}, {10, 11, 12, 13, 14}};
//        int[][] s={{0,1,2,3},{5,6,7,8},{10,11,12,13}};
         int[][] s2 = reduceRows(s);
         int[][] s3 = reduceRows2(s);

         for (int i = 0; i < s2.length; i++) {
             for (int j = 0; j < s2[i].length; j++) {
                 System.out.print(s2[i][j] + " ");

             }
             System.out.println();
         }
         for (int i = 0; i < s3.length; i++) {
             for (int j = 0; j < s3[i].length; j++) {
                 System.out.print(s3[i][j] + " ");

             }
             System.out.println();
         }


         System.out.println(mmm(10));


         do {
             ++b;
         } while (--a > 0);
         System.out.println(a + " " + b);


         Person p1 = new Person("Rolf", 60);
         Person p2 = new Person("Gudrun", 41);
         Person p3 = new Person("Hans", 40);
         Vehicle porsche = new Vehicle("Porsche", p1);
         Vehicle vwkaefer = new Vehicle("VW Beetle", p3);

         System.out.println(porsche);
         System.out.println(vwkaefer);
     }

     public static int At(int n) {
         int erg = 0;
         for (int i = 1; i <= n; i++) {
             if (n % i == 0)
                 erg++;
         }

         return erg;

     }

     public static int[] bubbleSort(int[] array) {
         int n = array.length;
         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                 if (array[j] > array[j + 1]) {
                     // swap array[j] and array[j+1]
                     int temp = array[j];
                     array[j] = array[j + 1];
                     array[j + 1] = temp;
                 }
             }
         }
         return array;
     }

     public static int mmm(int n) {
         if (n % 2 == 0)
             return 0;

         int[] feld = new int[n];

         for (int i = 0; i < feld.length; i++) {
             feld[i] = At(i + 1);
         }

         feld = bubbleSort(feld);

         int mid = n / 2;
         return feld[mid];


     }

      public static int[][] reduceRows(int[][] field) {
         int[][] newfeld = new int[field.length][];
         for (int i = 0; i < field.length; i++) {
             if (i % 2 == 1)//odd row
             {
                 newfeld[i] = field[i];

             } else {//even row
                 int s = 0;
                 int n = field[0].length;
                 newfeld[i] = new int[n - (n / 2)];//feld 01234 newfeld 024 5-(5/2)

                 for (int j = 0; j < field[i].length; j++) {
                     if (j % 2 == 0) {
                         newfeld[i][s++] = field[i][j];
                     }
                 }

             }


         }
         return newfeld;
     }


     static int[][] reduceRows2(int[][] field) {

         int arr[][]=new int[field.length-(field.length)/2][];

         int s=0;
         for (int i = 0; i < field.length; i++) {

             if (i % 2 == 0) {
                 arr[s++] = field[i];
             }
         }


         return arr;
     }

 }

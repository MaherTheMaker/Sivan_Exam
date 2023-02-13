package EidP_Klausur_09;
import java.util.Scanner;

public class Auswahl
{
    public static void main(String[] args)
    {

        System.out.println(prime_decomposition(230));
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[9];

        System.out.println("Enter 9 integers: ");
        for (int i = 0; i < 9; i++) {
            nums[i] = sc.nextInt();
        }

        zeigeMenue();

        int choice = sc.nextInt();
        while (choice != 4) {
            switch (choice) {
                case 1:
                    System.out.println("The 1st to 7th integers are: ");
                    for (int i = 0; i < 7; i++) {
                        System.out.print(nums[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("The 8th integer is: " + nums[7]);
                    break;
                case 3:
                    System.out.println("The 9th integer is: " + nums[8]);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
            choice = sc.nextInt();
        }
        System.out.println("Exiting program.");
        sc.close();
    }

    public static void zeigeMenue()
    {
        System.out.println("(1) Show the 1st to 7th entered number");
        System.out.println("(2) Show the 8th entered number");
        System.out.println("(3) Show the 9th entered number");
        System.out.println("(4) Exit the program");
    }

    public static int number_of_dividers(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static String prime_decomposition(int n) {
       String res="";
        for (int i = 2; i <= n; i++) {
            if (number_of_dividers(i) == 2) {
                while (n % i == 0) {
                    res+=i;
                    res+="*";
                    n /= i;
                }
            }
        }
        String newres="";
        for (int i = 0; i <res.length()-1 ; i++) {
            newres+=res.charAt(i);
        }

        return newres;
    }

    public static int[][] berechneTransponierte(int[][] feld)
    {
        int rows = feld.length;
        int columns = feld[0].length;

        int[][] transposed = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposed[j][i] = feld[i][j];
            }
        }

        return transposed;
    }


    public static boolean istSymmetrisch(int[][] feld)
    {
        int[][] transposed = berechneTransponierte(feld);
        int rows = feld.length;
        int columns = feld[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (feld[i][j] != transposed[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

}

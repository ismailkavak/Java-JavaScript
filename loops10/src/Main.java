import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number x: ");
        int x = scan.nextInt();

        System.out.print("Enter the number y: ");
        int y = scan.nextInt();
        int ebob = 1;
        int ekok = 1;

        // EBOB
        int i = 1;
        while (i <= x) {
            if (x % i == 0 && y % i == 0) {
                ebob = i;
            }
            i++;
        }

        System.out.println("EBOB: " + ebob);
        System.out.println("**************************");

        // EKOK
        int k = x;
        while (true) {
            if (k % x == 0 && k % y == 0) {
                ekok = k;
                break;
            }
            k++;
        }
        System.out.println("EKOK: " + ekok);
    }
}
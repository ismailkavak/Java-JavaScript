import java.util.Scanner;

public class Main {

    static boolean isPrime(int a, int b) {
        if (a == 2) {
            return true;
        } else if (a <= b) {
            return true;
        } else if (a % b == 0) {
            return false;


        } else {
            return isPrime(a, b + 1);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scan.nextInt();

        System.out.println(isPrime(a, 2));
    }
}

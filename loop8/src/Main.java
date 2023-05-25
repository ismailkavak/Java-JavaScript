import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" The number of steps the diamond will form : ");
        int n = input.nextInt();

        for (int i = 1; i < n; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k = 1; k <= n; k++) {
            System.out.print("*");
        }
        System.out.println();

        if ( n % 2 == 1 ){
            n--;
        }

        for (int i = 1; i <= n; i += 2) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter number of elements :  ");
        int n = scan.nextInt();
        int counter = 1;
        int counter2 = 1;
        int counter3 = 1;

        for (int i = 1; i <= n; i++) {
            counter *= i;
        }

        System.out.print(" Enter number of elements to choose from :  ");
        int r = scan.nextInt();

        for (int i = 1; i <= r; i++) {
            counter2 *= i;
        }

        for (int i = 1; i <= n - r; i++) {
            counter3 *= i;
        }
        System.out.print(" The combination is : " + counter / (counter2 * counter3));
    }
}

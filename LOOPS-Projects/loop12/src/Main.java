import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = scan.nextInt();

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println( num + " is a perfect num.");
        } else {
            System.out.println("The num " + num + " is not a perfect num.");
        }
    }
}

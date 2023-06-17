import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int steps = input.nextInt();
        int stars = steps * 2 - 1;

        for (int i = 0; i < steps; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println();

            stars -= 2;
        }
    }
}

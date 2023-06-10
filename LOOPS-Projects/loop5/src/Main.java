import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner power = new Scanner(System.in);
        int x, y;
        System.out.print(" Please enter the number whose power you want to find : ");
        x = power.nextInt();
        System.out.print(" Please enter the power : ");
        y = power.nextInt();

        int counter = 1;

        for (int i = 1; i <= y; i++) {
            counter = counter * x;
        }
        System.out.println(counter);
    }
}

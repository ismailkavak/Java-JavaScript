import java.util.Scanner;
public class Main {
    static int pow(int a, int b) {
        if (b == 0)
            return 1;

        return a * pow(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int a = scan.nextInt();
        System.out.print("Enter the power of base number: ");
        int b = scan.nextInt();

        System.out.println("The result is: " + pow(a, b));


    }
}

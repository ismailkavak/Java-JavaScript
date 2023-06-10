import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of inputs: ");
        int x = scan.nextInt();


        System.out.print("Enter : ");
        int num = scan.nextInt();
        int min = num;
        int max = num;

        for (int i = 1; i <= x - 1; i++) {
            System.out.print("Enter : ");
            num = scan.nextInt();

            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }

        }
        System.out.print("The max number is : " + max);
        System.out.println();
        System.out.print("The min number is : " + min);
    }
}

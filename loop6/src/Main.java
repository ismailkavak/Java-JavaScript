import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int number = input.nextInt();
        int tempNumber = number;
        int digitVal;
        int result = 0;

        while (tempNumber != 0) {
            digitVal = tempNumber % 10;
            result += digitVal;
            tempNumber /= 10;
        }
        System.out.println(result);

    }
}

import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number:");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("The result is: " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number:");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("The result is: " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number:");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("The result is: " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number:");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter the divisor 0.\n");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("The result is: " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scan.nextInt();
        System.out.print("Enter a power of the base: ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("The result is: " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("The result is: " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();

        System.out.println("The mod is : " + a % b);
    }

    static void rect(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the short edge: ");
        int a = scan.nextInt();
        System.out.println("Enter the long edge: ");
        int b = scan.nextInt();

        System.out.println("The perimeter is: "+ 2*(a+b));
        System.out.println("The area is: "+ a*b);
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction \n"
                + "3- Multiplicaiton\n"
                + "4- Division\n"
                + "5- Power\n"
                + "6- Factorial\n"
                + "7- Modulo\n"
                + "8- Rectangular Area and Perimeter Calculation\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please choose an operation: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rect();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered invalid value, please try again.");
            }
        } while (select != 0);


    }
}

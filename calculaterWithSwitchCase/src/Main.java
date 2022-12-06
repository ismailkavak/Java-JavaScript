import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double n1,n2;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number : ");
        n1 = input.nextDouble();

        System.out.print("Please enter the second number : ");
        n2 = input.nextDouble();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Please choose operation what do you want : ");
        int select = input.nextInt();

        switch ( select){
            case 1:
                System.out.println((n1+n2));
                break;
            case 2:
                System.out.println((n1-n2));
                break;
            case 3:
                System.out.println((n1*n2));
                break;
            case 4:
                System.out.println((n1/n2));
                break;

        }
        System.out.print("Your calculating is completed!");
























    }
}

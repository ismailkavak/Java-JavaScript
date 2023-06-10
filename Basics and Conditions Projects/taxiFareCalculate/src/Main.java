import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int openning = 10;
        double km;


        System.out.print("Enter how many kilometers you want to travel : ");

        Scanner traveled = new Scanner(System.in);
        km = traveled.nextDouble();


        double result = openning + (km * 2.20);
        System.out.println(result + " TL ");

        // Calculating system(for minimum price also minimum price is 20 )
        double finalResult = result > 20 ? result : 20;
        System.out.println(finalResult + " TL ");


    }
}

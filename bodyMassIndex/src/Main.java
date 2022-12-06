import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double length, mass;
        System.out.println("Please enter your height in meters and your weight in kilograms : ");


        Scanner BMI = new Scanner(System.in);
        length = BMI.nextDouble();
        mass = BMI.nextDouble();

        
        System.out.println("Your BMI is : ");
        double calculateBMI = mass / (length * length);


        System.out.println(calculateBMI);


    }
}

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	double[] numList = new double[3];
    double a;
    double sum = 0;
        for( int i = 0; i < numList.length; i++){
            Scanner num = new Scanner(System.in);
            System.out.print("Enter the numbers to calculate harmonic average: ");
            a = num.nextInt();
            sum += 1/a;
        }
        System.out.print("The harmonic average is: ");
        System.out.println(numList.length/sum);
    }
}

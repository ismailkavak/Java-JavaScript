import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        double a;
        System.out.print("Enter a price : ");
        Scanner price = new Scanner(System.in);
        a = price.nextDouble();
        double KDV = 0.18;
        double KDV2 = 0.08;
        double kdvAmount = a*KDV;
        double kdvAmount1 = a* KDV2;

        double result = a <1000 ? kdvAmount : kdvAmount1;

        System.out.print("KDV amount : ");
        System.out.println(result + " TL");

        System.out.print("KDV price : ");

        System.out.println( result + a + "TL");





    }
}

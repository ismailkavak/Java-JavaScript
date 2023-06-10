import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);
    double r;
        System.out.println("Enter a r value : ");
        r = radius.nextDouble();
        System.out.println("Is the angle radians(r) or degrees(d): ");



        double calculateArea = Math.PI*r*r;
        double calculatePerimeter = 2*Math.PI*r;
        System.out.println(calculateArea);
        System.out.println(calculatePerimeter);

        double angle;
        angle = radius.nextDouble();


        double calculateSectorArea = (calculateArea * angle) / 360;
        System.out.println(calculateSectorArea);




    }
}

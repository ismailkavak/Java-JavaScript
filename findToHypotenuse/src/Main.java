import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*
	    double a,b;
        System.out.print("Enter the first side : ");
        Scanner sides = new Scanner(System.in);
        a = sides.nextDouble();
        System.out.print("Enter the second side : ");
        b = sides.nextDouble();
        double hypotenuse = Math.sqrt(a*a + b*b);
        System.out.print("Hypotenuse is : ");
        System.out.print(hypotenuse);
        */
        // Find to area
        double a,b,c;
        System.out.println("Enter the sides : ");
        Scanner sides = new Scanner(System.in);
        a = sides.nextDouble();
        b = sides.nextDouble();
        c = sides.nextDouble();

        double perimeter = a + b + c;
        System.out.println(perimeter);
        double u = perimeter / 2;
        double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("The area is : ");
        System.out.println(area);







    }
}

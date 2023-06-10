import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int age, tripType;
        double distance, price;

        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter the distance you will trip : ");
        distance = input.nextDouble();
        if ( distance < 0 ){
            System.out.println(" You entered invalid distance! ");
            return;
        }
        System.out.print(" Please enter your age : ");
        age = input.nextInt();
        if (age < 0 ){
            System.out.println(" You entered invalid age! ");
            return;
        }
        System.out.print(" Please enter your trip tpye : ");
        tripType = input.nextInt();
        price = distance * 0.10;
        if ( age <= 12) {
            price = (price * 50 / 100);

        } else if ( age < 24 ) {
            price = (price - (price * 10 / 100));
        } else {
            price = price - (price * 30 / 100);
        }


        switch (tripType) {
            case 1:
                System.out.println(" The price is : " + price);
                break;
            case 2:
                System.out.println(" The price is : " + ((price * 2) - (price * 20 / 100 * 2)));
                break;
            default:
                System.out.println(" You entered invalid value! ");
        }

    }
}

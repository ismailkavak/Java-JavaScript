
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter month who you are born : ");
        month = input.nextInt();
        System.out.print("Please enter your day who you are born : ");
        day = input.nextInt();
        if (month == 1) {
            if (day <= 20) {
                System.out.println("Goat");
            } else
                System.out.println("Bucket");
        }
        if (month == 2) {
            if (day <= 19) {
                System.out.println("Bucket");
            } else
                System.out.println("Fish");
        }
        if (month == 3) {
            if (day <= 20) {
                System.out.println("Fish");
            } else
                System.out.println("Coach");
        }
        if (month == 4) {
            if (day <= 20) {
                System.out.println("Coach");
            } else
                System.out.println("Bull");
        }
        if (month == 5) {
            if (day <= 20) {
                System.out.println("Bull");
            } else
                System.out.println("Twins");
        }
        if (month == 6) {
            if (day <= 21) {
                System.out.println("Twins");
            } else
                System.out.println("Crab");
        }
        if (month == 7) {
            if (day <= 22) {
                System.out.println("Crab");
            } else
                System.out.println("Lion");
        }
        if (month == 8) {
            if (day <= 23) {
                System.out.println("Lion");
            } else
                System.out.println("Virgo");
        }
        if (month == 9) {
            if (day <= 23) {
                System.out.println("Virgo");
            } else
                System.out.println("Scales");
        }
        if (month == 10) {
            if (day <= 23) {
                System.out.println("Scales");
            } else
                System.out.println("Scorpion");
        }
        if (month == 11) {
            if (day <= 22) {
                System.out.println("Scorpion");
            } else
                System.out.println("Arrow");
        }
        if (month == 12) {
            if (day <= 21) {
                System.out.println("Arrow");
            } else
                System.out.println("Goat");
        }
    }
}

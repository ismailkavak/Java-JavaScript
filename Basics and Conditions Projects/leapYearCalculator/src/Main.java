import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        System.out.println("Please enter the year : ");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();


        if (year % 4 == 0){
            System.out.println(year + " is a leap year.");
        }else
            System.out.println(" Not a leap year!");
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numList = {10,17,-5,14,12,25};

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int closer = scan.nextInt();

        int max = numList[0];

        int min = numList[0];


        for (int i : numList) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        for (int i : numList) {
            if ( i < closer && i > min){
                min = i;
            }else if ( i > closer && i < max){
                max = i;
            }
        }

        System.out.println("Max close value is: " + max);
        System.out.println("Min close value is: " + min);

    }
}

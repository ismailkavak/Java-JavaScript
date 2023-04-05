import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k;
        Scanner value = new Scanner(System.in);
        System.out.print(" Enter a value : ");
        k = value.nextInt();

        System.out.print(" 4 powers : ");
        for (int i = 1; i < k; i *= 4) {
            System.out.print(i + ",");

        }
        System.out.println();

        System.out.print(" 5 powers : ");
        for (int i = 1; i < k; i *= 5) {

            System.out.print(i + ",");
        }
    }
}
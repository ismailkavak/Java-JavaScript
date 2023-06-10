import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        k = input.nextInt();

        int counter = 0;
        int sayac = 0;

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sayac += i;
                counter++;
            }
        }
        System.out.println(sayac / counter);
    }
}

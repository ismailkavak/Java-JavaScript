import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 11, 12};

        Arrays.sort(list);

        int len = list.length;
        int i = 0;

        while (i < len) {
            int element = list[i];
            int frequency = 1;

            while (i + 1 < len && list[i] == list[i + 1]) {
                frequency++;
                i++;
            }

            System.out.println("The number " + element + " is repeated "  + frequency + " times" );

            i++;
        }
    }
}

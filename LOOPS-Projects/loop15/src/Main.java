import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Fibonacci series: ");
        int numElements = scanner.nextInt();

        int prevNum = 0;
        int currNum = 1;

        System.out.print(numElements + " Element Fibonacci Series: ");

        if (numElements >= 1) {
            System.out.print(prevNum + " ");
        }

        if (numElements >= 2) {
            System.out.print(currNum + " ");
        }

        for (int i = 3; i <= numElements; i++) {
            int nextNum = prevNum + currNum;
            System.out.print(nextNum + " ");

            prevNum = currNum;
            currNum = nextNum;
        }
    }
}
import java.util.Scanner;
public class Main {

    static int fib(int x){
        if (x == 1 || x == 2)
            return 1;

        return fib(x-1) + fib(x-2);
    }

    public static void main(String[] args) {
	    int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scan.nextInt();
        System.out.println(fib(n));

    }
}

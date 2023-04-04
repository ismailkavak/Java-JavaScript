import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num;
    int total = 0;
    Scanner scan = new Scanner(System.in);

    do {
        System.out.println(" Enter a number : ");
        num = scan.nextInt();
        if ( num % 2 == 0  && num % 4 ==0){
            total = total +num;
        }

    }while (num % 2 == 0);
        System.out.println(total);




    }
}

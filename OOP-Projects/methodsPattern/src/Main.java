import java.util.Scanner;
public class Main {

    static void pat(int a, int b, int c){

        if (a <= 0){
            pat(a+5,b,5);

        }else if (a != b || c != 5){

            pat(a+c,b,c);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scan.nextInt();
        pat(a,a,-5);

    }
}

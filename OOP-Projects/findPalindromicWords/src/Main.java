import java.util.Scanner;
public class Main {

    static boolean isPalindrome(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the word: ");
        String str = scan.nextLine();

        int i = 0, j = str.length() -1;
        while ( i <= j){
            if ( str.charAt(i) != str.charAt(j)){

                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    static boolean isPalindrome2(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the second word: ");
        String str = scan.nextLine();
        String reverse = "";
        for ( int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)){
            return true;
        }
        return false;

    }


    public static void main(String[] args) {

        if ( isPalindrome()){
            System.out.println("This word is a palindromic word.");
        }else{
            System.out.println("BRUH1!");
        }

        if ( isPalindrome2()){
            System.out.println("This word is a palindromic word.");
        }else{
            System.out.println("BRUH2!");
        }
    }
}

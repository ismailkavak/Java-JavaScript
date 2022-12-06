import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password, answer;

        String newUserName;
        String newPassword;


        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter your username : ");
        userName = input.nextLine();

        System.out.print(" Please enter your password : ");
        password = input.nextLine();

        if (userName.equals("Poyraz") && password.equals("123456")) {
            System.out.println(" You enter successfully ! ");
        } else
            System.out.println(" You entered the username or password incorrectly ! ");
        System.out.print(" Do you wanna change your paswword Yes or No ? " + "  -");
        answer = input.nextLine();
        if (answer.equals("Yes")) {
            System.out.print("New password is : ");
            newPassword = input.nextLine();
            System.out.print("New username is : ");
            newUserName = input.nextLine();

            if (newPassword.equals("123456") || newUserName.equals("Poyraz")) {
                System.out.println("Entered wrong");
            } else System.out.println("Helal gocum");

        }


    }

}

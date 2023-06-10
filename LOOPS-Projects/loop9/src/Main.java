import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right = 3;
        int select;
        int balance = 1500;

        while (right > 0) {
            System.out.print(" Enter your username: ");
            userName = scan.nextLine();
            System.out.print(" Enter your password: ");
            password = scan.nextLine();

            if (userName.equals("yemen") && password.equals("852852")) {
                System.out.println(" You logged into the system. ");

                do {

                    System.out.println("1-Lodgement\n" + "2-Withdraw\n" + "3-Balance inquiry\n" + "4-Exit from the system.");
                    System.out.print(" Please select the process you want to do: ");
                    select = scan.nextInt();
                    scan.nextLine();

                    switch (select) {
                        case 1:
                            System.out.print("Money amount: ");
                            int depositAmount = scan.nextInt();
                            scan.nextLine();
                            balance += depositAmount;
                            System.out.println("Your balance is: " + balance);
                            break;

                        case 2:
                            System.out.print("Money amount: ");
                            int withdrawAmount = scan.nextInt();
                            scan.nextLine();
                            if (balance >= withdrawAmount) {
                                balance -= withdrawAmount;
                                System.out.println("Left balance is: " + balance);
                            } else {
                                System.out.println("Insufficient balance. Try again.");
                            }
                            break;

                        case 3:
                            System.out.println("Your balance is: " + balance);
                            break;

                        case 4:
                            System.out.println("Exiting from the system.");
                            break;

                        default:
                            System.out.println("Invalid selection. Try again.");
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println(" Username or password is incorrect! ");
                if (right == 0) {
                    System.out.println(" Your account has been blocked! ");
                } else {
                    System.out.println(" Your remaining tries: " + right);
                }
            }
        }
    }
}
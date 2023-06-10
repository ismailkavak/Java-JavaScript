import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int temperature;
        System.out.println("1-temperature<5\n2-5<temperature<15 arasında\n3-5<temperature<15 arasında\n4-tepmerature > 25");
        System.out.println("Choose temperature of weather :");
        Scanner input = new Scanner(System.in);
        temperature = input.nextInt();
        switch (temperature) {
            case 1:
                System.out.println("Recommended activity : Ski ");
                break;
            case 2:
                System.out.println("Recommended activity : Go To Cinema");
                break;
            case 3:
                System.out.println("Recommended activity : Go To Picnic");
                break;
            case 4:
                System.out.println("Recommended activity : Go To Swim");
                break;
            default:
                System.out.println("Calm down man :)");
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music,total = 0, lectureCount = 0;
        Scanner input = new Scanner(System.in);


        System.out.print(" Please enter your math grade : ");
        math = input.nextInt();
        if (  100 >= math && math >= 0  ){
            total += math;
            lectureCount++;
        }

        System.out.print(" Please enter your math grade : ");
        physics = input.nextInt();
        if (  100 >= physics && physics >=0  ){
            total += physics;
            lectureCount++;
        }

        System.out.print(" Please enter your math grade : ");
        turkish = input.nextInt();
        if (  100 >= turkish && turkish >=0){
            total += turkish;
            lectureCount++;
        }

        System.out.print(" Please enter your math grade : ");
        chemistry = input.nextInt();
        if (  100 >= chemistry && chemistry >= 0 ){
            total += chemistry;
            lectureCount++;

        }

        System.out.print(" Please enter your math grade : ");
        music = input.nextInt();
        if (  100 >= music && music >= 0  ){
            total += music;
            lectureCount++;

        }

        int average = (total / lectureCount);

        if (average >= 55) {
            System.out.println("Congratulations! You passed to class. ");

        } else
            System.out.println("You couldn't pass to class! ");

        System.out.println("Your average grade is " + average + ".");


    }
}

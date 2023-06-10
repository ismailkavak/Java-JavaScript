import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int music, history, physics, turkish, chemistry;
    Scanner note = new Scanner(System.in);
        System.out.print(" Enter your music note : ");
        music = note.nextInt();


        System.out.print(" Enter your history note : ");
        history = note.nextInt();

        System.out.print(" Enter your physics note : ");
        physics = note.nextInt();


        System.out.print(" Enter your turkish note : ");
        turkish = note.nextInt();


        System.out.print(" Enter your chemistry note : ");
        chemistry = note.nextInt();


        double average = (music + history + physics + turkish + chemistry)/5;
        System.out.print("Your average is : ");
        System.out.println(average);


        String result = average >= 60 ? "Passed" : "Failed";
        System.out.println(result);

















    }
}

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        double pear, apple, tomato, banana, aubergine;
        // Price for per kilogram
        pear = 2.14;
        apple = 3.67;
        tomato = 1.11;
        banana = 0.95;
        aubergine = 5;

        double forPear, forApple, forTomato, forBanana, forAubergine;
        System.out.print("How much kg do you wanna buy pear : ");
        Scanner kilogram = new Scanner(System.in);
        forPear = kilogram.nextDouble();

        System.out.print("How much kg do you wanna buy apple : ");
        forApple = kilogram.nextDouble();

        System.out.print("How much kg do you wanna buy tomato : ");
        forTomato = kilogram.nextDouble();

        System.out.print("How much kg do you wanna buy banana : ");
        forBanana = kilogram.nextDouble();

        System.out.print("How much kg do you wanna buy aubergine : ");
        forAubergine = kilogram.nextDouble();
        
        double calculate = (forPear * pear) + (forApple * apple) + (forTomato * tomato) + (forBanana * banana) + (forAubergine * aubergine) ;
        System.out.println(calculate);


    }
}

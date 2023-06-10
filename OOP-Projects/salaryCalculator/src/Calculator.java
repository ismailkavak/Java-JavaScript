import java.util.Scanner;

public class Calculator {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raiseSalary;
    double baseSalary;

    Calculator(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = 0;
        this.bonus = 0;
        this.raiseSalary = 0;
        this.baseSalary = this.salary;
    }
    void calculateAll(){
        this.raiseSalary();
        this.bonus();
        this.tax();
    }
    void raiseSalary() {
        int newYear = 2021 - this.hireYear;
        if (newYear < 10) {
            this.salary = (this.salary) + (this.salary * 0.05);
            this.raiseSalary = this.salary * 0.05;
        } else if (9 < newYear && newYear < 20) {
            this.salary = (this.salary) + (this.salary * 0.1);
            this.raiseSalary = this.salary * 0.1;
        } else {
            this.salary = (this.salary) + (this.salary * 0.15);
            this.raiseSalary = this.salary * 0.15;
        }


    }

    void bonus() {

        Scanner scan = new Scanner(System.in);
        int extra;

        if (workHours > 40) {
            System.out.print("How many hours did you work extra : ");
            extra = scan.nextInt();
            while (extra > 24 || extra < 0) {
                System.out.println("You entered invalid value. It must be between 0 and 24.");
                System.out.print("How many hours did you work extra : ");
                extra = scan.nextInt();
            }
            int extraSalary = extra * 30;
            this.salary = this.salary + extraSalary;
            this.bonus = extraSalary;
        }
    }


    void tax() {
        if (this.salary < 1000) {
            System.out.println("No taxes.");
            this.tax = 0;
        } else {
            this.salary = (this.salary) - (this.salary * 0.03);
            this.tax = this.salary * 0.03;
        }
    }


    public String toString() {

        return "Name: %s\nSalary after taxes and bonuses: %.2f\nWork Hours: %d\nHire Year: %d\nTaxes: %.2f\nBonus: %.2f\nRaise: %.2f"
                .formatted(this.name, this.salary, this.workHours, this.hireYear, this.tax, this.bonus, this.raiseSalary);


    }


}

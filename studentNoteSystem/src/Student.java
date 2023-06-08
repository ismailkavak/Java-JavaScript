public class Student {
    Course c1;
    Course c2;
    Course c3;



    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;




    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3, int oralNote1,int oralNote2, int oralNote3) {

        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (oralNote1 >= 0 && oralNote1 <= 100) {
            this.c1.oralNote = oralNote1;
        }
        if (oralNote2 >= 0 && oralNote2 <= 100) {
            this.c2.oralNote = oralNote2;
        }
        if (oralNote3 >= 0 && oralNote3 <= 100) {
            this.c3.oralNote = oralNote3;
        }


    }



    void isPass(){
        System.out.println("=======================");
        this.average = (this.c1.getAverageNote() + this.c2.getAverageNote() + this.c3.getAverageNote() )/3.0;
        if (this.average > 55){
            System.out.println("Passed class!");
            this.isPass = true;
        }else{
            System.out.println("You couldnt pass!");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {

        System.out.println(this.c1.name + " Note : " + this.c1.note);
        System.out.println(this.c1.name + " Oral Note : " + this.c1.oralNote);

        System.out.println(this.c2.name + " Note : " + this.c2.note);
        System.out.println(this.c2.name + " Oral Note : " + this.c2.oralNote);

        System.out.println(this.c3.name + " Note : " + this.c3.note);
        System.out.println(this.c3.name + " Oral Note : " + this.c3.oralNote);



        System.out.println("The average is: "+ this.average);
    }
}


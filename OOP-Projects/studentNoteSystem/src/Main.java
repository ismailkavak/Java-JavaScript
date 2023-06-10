public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Teacher ", "HSTRY", "20029008");
        Teacher t2 = new Teacher("Poyraz", "PHY", "58998");
        Teacher t3 = new Teacher("Hacı CavCav", "MATH", "35");

        Course history = new Course("History", "101", "HSTRY", 0.3f);
        history.addTeacher(t1);

        Course physics = new Course("Physics", "101", "PHY", 0.4f);
        physics.addTeacher(t2);

        Course mathematics = new Course("Mathematic", "132", "MATH", 0.2f);
        mathematics.addTeacher(t3);

        Student s1 = new Student("Mohad", "20008", "2", history, physics, mathematics);

        s1.addBulkExamNote(55, 78, 50, 100, 100, 100);
        s1.isPass();


    }
}

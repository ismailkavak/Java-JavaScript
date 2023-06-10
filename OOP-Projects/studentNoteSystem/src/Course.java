public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralNote;
    float oralPercent;

    Course(String name, String code,String prefix,float oralPercent) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.oralPercent = oralPercent;
    }
    float getAverageNote(){
        return oralNote*oralPercent + note * (1 - oralPercent);
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Teacher and course parts do not match.");
        }
    }

    void printTeacherInfo(){
        this.teacher.print();
    }
}

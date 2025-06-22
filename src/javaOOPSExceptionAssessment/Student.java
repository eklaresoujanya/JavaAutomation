package javaOOPSExceptionAssessment;

public class Student {
    String name;
    int rollNo;
    String section;

    public Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    public static void main(String[] args) {
        Student student = new Student("Bob", 101, "A");
        System.out.println("Student: " + student.name + ", RollNo: " + student.rollNo + ", Section: " + student.section);

    }
}

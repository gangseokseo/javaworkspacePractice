package classpart;

public class Student {

    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void showStudentInfor() {
        System.out.println(studentName + "," + studentId);
    }

    public static void main(String[] args) {
        Student student = new Student(3, "gghgg");
        student.showStudentInfor();
    }
}

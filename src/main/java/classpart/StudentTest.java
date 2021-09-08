package classpart;

public class StudentTest {

    public static void main(String[] args) { //클래스를 돌리기위해 필요한 메인메소드 //run을하면 이부분이 구동

        Student1 studentLee = new Student1(); //클래스생성
        studentLee.studentName = "이순신";
        studentLee.address = "서울시 서초구 서초동";

        studentLee.showStudentInfo();
    }
}

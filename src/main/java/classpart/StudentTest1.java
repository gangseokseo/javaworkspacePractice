package classpart;

public class StudentTest1 {
    public static void main(String[] args) {

        //다른클래스에서 사용하는것처럼 코딩을 하려면 새로 클래스를 만들고 메인함수를 만들어라.

        Student2 studentLee = new Student2(); //new 생성자(기본생성자)
        // 인스턴스가 assign된 변수 studentLee를 참조변수라한다

        studentLee.studentName = "이순신";           //studentLee.---- 참조할 값들이 보인다
        studentLee.studentID = 100;
        studentLee.address = "서울시 영등포구 여의도동";

        Student2 studentKim = new Student2(); //new 생성자(기본생성자)
        // 인스턴스가 assign된 변수 studentLee를 참조변수라한다
        studentKim.studentName = "김유신";           //studentLee.---- 참조할 값들이 보인다
        studentKim.studentID = 101;
        studentKim.address = "미국 산호세";


        //인스턴스 2개 생성

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        System.out.println(studentLee); //참조값
        System.out.println(studentKim); //참조값값


    }

}

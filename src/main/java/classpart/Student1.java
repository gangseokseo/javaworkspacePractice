package classpart;

public class Student1 { //public (접근제어자)
    int StudentID;// 학번
    String studentName; //학생이름
    int grade; //학년
    String address; //사는 곳

    //학생 이름과 주소 출력하는 메서드 만들기
    //기능추가 학생정보 보여주기//메서드 추가
    //메소드 이름도 추가할때마다 소문자로시작
    public void showStudentInfo(){//  메소드이름 소문자로 시작
        System.out.println(studentName + "," + address);

    }
    //학생의 이름을 반환하는 메서드
    //메서드 작성시  클래스를 사용하는 입장에서 작성한다. -> get 메서드 이름을 가져간다
    //매개변수는 필요없다. 반환값은 studentName , 반환형은 String 있다
    public String getStudentName(){
        return studentName;
    }

    //학생이름을 바꾸고싶다(외부에서 이름을 바꾸는건 set)
    //바꿀이름을 매개변수로, 반환값은 없다 . 반환형은 void
    public void setStudentName(String name){
        studentName = name;
    }


    /*
    public static void main(String[] args) { //클래스를 돌리기위해 필요한 메인메소드 //run을하면 이부분이 구동

        Student1 studentLee = new Student1(); //클래스생성
        studentLee.studentName = "이순신";
        studentLee.address = "서울시 서초구 서초동";

        studentLee.showStudentInfo();
    }
     */
    //여기 메인함수(메서드)는 student1의 메소드라 하지 않는다. 단순히 시작되는 함수이다.

    // 메인메소드가 StudentTest로 갔을경우 여기는 메인이없어서 자바 run 실행이 안된다
    //항상 메인메소드가 클래스에 안에 있지않는다. 다른클래스에서 불러서 사용이 가능한다(StudentTest)


}
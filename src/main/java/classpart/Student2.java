package classpart;

public class Student2 { //public (접근제어자)
    int studentID;// 학번
    String studentName; //학생이름
    int grade; //학년
    String address; //사는 곳


    //메소드 이름도 추가할때마다 소문자로시작
    public void showStudentInfo(){
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

    //어떻게 가져다 쓸것이냐? 2가지 방법 , main()
    //main() -> 메인함수지 메서드는 아니다. 클래스 내부에서 만들지만 클래스의 메서드는 아니다
    public static void main(String[] args) {


        int i = 10; //객체가 아니다. primitive data 타입이다.
                    //Student2는 객체타입이다. ->메서드나 속성 , property를 정의할수 있고 그리고 걔를 생성할 수 있다
                    //객체는 반드시 생성하여 사용한다
                    //변수의 타입은 2가지 위와같은 기본데이터 타입, 아래와 같은 참조형 데이터 타입이 있다. 그옆의 변수를참조변수라 한다

        Student2 studentLee = new Student2(); //new 생성자(기본생성자)
        // 인스턴스가 assign된 변수 studentLee를 참조변수라한다

        studentLee.studentName = "이순신";           //studentLee.---- 참조할 값들이 보인다
        studentLee.studentID = 100;
        studentLee.address = "서울시 영등포구 여의도동";

        Student2 studentKim = new Student2(); //new 생성자(기본생성자)
                                              // 인스턴스가 assign된 변수 studentLee를 참조변수라한다
        studentKim.studentName = "김유신";
        studentKim.studentID = 101;
        studentKim.address = "미국 산호세";

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        //생각해볼것- 어디에 생성되어있느냐?,
        //student2 선언에 studentLee
    }

}
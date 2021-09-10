package reference;

public class Student {
//과목점수 등 클래스를 따로 분류 Subject
    //클래스 자료형으로 선언하는 참조자료형 변수

    int studentID;
    String studentNAme;

    //학생에 대한 클래스인데 과목에 대하 변수가 있으니 Subject 클래스를 분리하고 학생에 Subject변수를 과목별로 추가한다.
    //    int mathScore;    //과목 점수
    //    String koreaSubject;// 과목이름
    //    String mathSubject;
    //    int engScore;
    //    String engSubject;

    //과목클래스 Subject를 가져다쓴다, Student는 Subject 클래스를 멤버변수로 가진다
    //여기서 Subject는 참조자료형이다
    Subject korea;
    Subject math;

    /*
    즉, 단순하게 Subject에 있는 메소드를 가져오는 것이 아니라
    해당 변수의 타입을 Subject라는 사용자 정의 객체 타입으로 선언
     */


    //???????????
    //위에 참조자료형 선언만하고 끝낼게 아니라 클래스 생성 필요 사용방법
    public Student(){ //생성자 호출

        korea = new Subject("국어"); //각과목에대한 인스턴스 생성
        math = new Subject("수학"); //참조자료형은 인스턴스 new하고 쓰면 된다.예외는 밑에 String같은것


    }

    //생성자 오버로딩(생성자 여러개)
    //학생을 만들때 학생의 id와 이름을 받겠다
    public  Student(int id, String name){
        studentID = id; //멤버변수에 세팅
        studentNAme= name; //string (new하지않아도 그냥쓸 수 있는 자료형 ,(클래스)들이 있다. 기본자료형쓰듯이


        korea = new Subject("국어"); //각과목에대한 인스턴스 생성
        math = new Subject("수학");

        //마지막 구조 바꾸기 Subject에 이름을 주고싶다
        //subject는 각각 이름을 주기보단 과목이름은 과목 생성할때 주는게 좋다. 학생마다 과목이 달라지지 않으니까
    }
   //새 메서드 set, get함수????????

    //학생의 한국어 과목에 대한 이름, 점수
    //코딩할때 학생을 먼저 생성해주고, 듣는 과목 세팅
    //setKorea함수를 부를 것이고. 자기가 가는 멤버변수 korea -> setSubjectName에서 name을 넣어라
    public void setKorea( int score){
         //앞의 korea 한국어 과목을 가리킴
        korea.setScore(score);
    }

    //수학점수(동일)
    public void setMath( int score){

        math.setScore(score);
    }

    //수강하는 과목들의 총점
    //원래는 배열이나 array를 배우면 학생의 듣는 과목을 넣어서 한다.각각 만들지는 않는다
    public void showStudentInfo(){
        int total = korea.getScore() + math.getScore();
        System.out.println(studentNAme + "학생의 총점은" + total + "점 입니다.");
    }


}

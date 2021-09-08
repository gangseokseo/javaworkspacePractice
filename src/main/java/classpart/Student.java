package classpart;

public class Student { //public (접근제어자)
    int studentID;// 학번
    String studentName; //학생이름
    int grade; //학년
    String address; //사는 곳

    //생성자

    //학생 id와 이름을 전달받아 생성하고 싶다
    //매개변수가 있는 생성자
    public Student(int id, String name) {
    //객체가 생성될때 수행되야 하는 명령어 코드

        studentID = id;
        studentName = name;
    }
    public Student(){

    }
    //같은 이름을 가진 생성자 존재가능능

                         //디폴트 생성자 (기본) , 아무것도 안써도 자바컴파일러에서 추가해준다.
                          // 특징 : 매개변수가 없고 구현코드도 없다
                          // 언제 생기는가? 생성자가 어느곳에도 없을때만 생성된다. 하나라도 생성되있으면 나오지 않는다
    //생성자의 용도 : 객체를 처음 생성하면서 하고싶은 일들 , 해야 될 일들을 구현하는 것이다

    public void showStudentInfo(){//  메소드이름 소문자로 시작
        System.out.println(studentName + "," + address);

    }

    public String getStudentName(){
        return studentName;
    }


    public void setStudentName(String name){
        studentName = name;
    }


}

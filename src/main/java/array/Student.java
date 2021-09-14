package array;

import java.util.ArrayList;

public class Student {

    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList; //ArrayList 선언
                                            //학생이 수강하는 여러 과목들을 배열로 관리. 배열의 자료형은 Subject

    //생성자
    public Student(int studentID, String studentName ){
        this.studentID = studentID;
        this.studentName = studentName;

        //학생이 1명 생성되면 배열도 생성된다
        subjectList = new ArrayList<Subject>(); //ArrayList 생성
                                                //ArrayList 는 Subject 요소를 가지고 있다
    }


    // 학생이 과목을 수강했을때 subjectList 에 추가되는 메서드, 배열에 추가될 수 있는 메서드
    public   void addSubject(String name, int score){
        Subject subject = new Subject(); //생성
        subject.setName(name);  //get 이 아닌가?
        subject.setScorePoint(score);

        //생성된 subject 가 학생의 List 에 요소로 추가된다
        subjectList.add(subject);
    }

    //학생생의 정보를 보여주는 메서드 //과목에 몇점이고 총점에 몇점인가?
    public void  showStudentInfo(){

        int total = 0;
        for(Subject subject :  subjectList){
            total += subject.getScorePoint(); //총점더하기


            System.out.println("학생" +  studentName + "님의 " + subject.getName() + "과목의 성적은"
                                + subject.getScorePoint() + "점 입니다");
        }
        System.out.println("학생" + studentName + "님의 총점은" + total + "점 입니다");
    }
}

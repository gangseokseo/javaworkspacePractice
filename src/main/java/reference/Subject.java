package reference;

public class Subject {
//과목에 대한 클래스

    String subjectName; //과목이름
    int score; //점수

    //마지막 구조바꾸기
    //생성자 만들기
    public Subject(String name){
        subjectName = name; //생성할때 이름 부여?
    }

    //위의 멤버변수에 대한 get , set 메서드를 만들어 주고 싶다
    public void setSubjectName(String name){
        subjectName = name;
    }

    //getter setter -> 멤버변수에 자동으로 get을하거나 set을 하는 코드
    //직접만들지말고 alt + insert로 생성해라

    public String getSubjectName() {
        return subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
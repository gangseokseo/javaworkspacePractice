package hiding;

class BirthDay {
   private int day;
   private int month;
   private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

        if (month ==2){
            if( day < 1 || day > 28){
                System.out.println("날짜 오류입니다.");
            }
        }

        else {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {


        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //접근제어자 private는 같은파일이어도 보이지 않는다 . 외부클래스에서 사용할 수 없다.
    //그럼 값을 세팅해주고 싶으면 generate getter setter를 통해서 public 메서드를 오픈해준다
    //그러면 메서드를 이용해서 쓸 수 있다

    //모두다 public으로 오픈이면 무결성이 침범될 수 있다
    //private 감춰놓고 public메서드를 제공하면 처리한다, getter setter로 값을 가져가거나 저장한다.
}
//하나의 자바파일 안에 클래스가 2개일 수 있다.
//public class는 단 1개이고 자바파일 이름하고 같아야한다

public class BirthDayTest{

    public static void main(String[] args) {

        //생일 생성, 참조변수?(new생성자 할때)
        BirthDay day = new BirthDay(); //day 참조변수 ->인스턴스 멤버변수와, 메서드 참조하여 사용

        day.setMonth(2);
        day.setDay(30);
        day.setYear(2018);
    }

}
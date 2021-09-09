package reference;

public class Circle {
    //참조자료형 변수

    //x,y 직접 선언할 수 있지만,Point 클래스에서 가져온다 point x, point y로 '선언'
    Point point; //클래스 안에서 다른클래스를 가져다 사용한다(참조자료형 변수로 가져다 쓴다)
                //객체선언 전까지는 사실상 빈껍데기

    int radius; //반지름

    public Circle(){ //생성자

        point = new Point(); //멤버변수인 point를 new Point로 '생성'한다 (왜 객체생성?? 앞에 클래스명 어디?)
                            //디폴트 생성자 안에 또 생성자를 만들 수도 있나?
                            //point = new Point(); 이 부분이 Point Class에 대해서 새로운 객체를 선언한 것
        //언제 객체선언할지를 정해야한다 유동적.
    }

    public void test(){
        int i = point.x;
    }
}

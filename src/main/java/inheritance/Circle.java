package inheritance;

public class Circle {

    //원의점을 활용하고 싶으면, 상속관계는 아니고 변수 선언해라.


    Point point; //참조변수 사용 //합성 (has ~ a) 가져다 사용하는것

    private int radius;

    public Circle(){//생성자

        point = new Point();//생성

    }
}

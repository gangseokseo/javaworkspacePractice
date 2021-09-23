package template;

public abstract class Car {
//추상클래스와 템플릿 메서드 활용
//차가 달리거나 멈추는 방법, 차종류에 따라 다르기 때문에 여기서는 구현할 수 없다
    public  abstract  void drive();
    public  abstract  void stop();

    //wiper 메서드 추가시
    public abstract void wiper();


    public void starCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다");
    }

    //템플릿 메서드 방식
    //프레임워크에서 많이 사용한다.  - 템플릿 메서드 , 추상클래스 , 인터페이스 이용해서 설계할 때 많이 사용한다
    //후크 메서드 - 구현코드가 없지만 하위클래스에서 필요에 의해서 재정의 할 수 있다. -> 구현이 추가 add-on 된다
    //구현을 했는데 구현코드(body)가 없다
    public void washCar(){}

    //템플릿 메서드(공통)
    //차가 작동되는 공통 시나리오(변할 수 없다)
    //이런 시나리오는 재정의 하면 안된다(final 예약어 넣기- 하위클래스에는 이 메서드를 오버라이딩 할 수 없다 )
    //앞에다 final 써도된다
    public final void run() {
        starCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff();

    }
}

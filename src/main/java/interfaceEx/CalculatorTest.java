package interfaceEx;

public class CalculatorTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        //타입상속을 받았다. Calc 라는 타입
        Calc calc = new CompleteCalc(); //객체선언이 성립할려면 CompleteCalc 클래스가
                                        // Calc 에 대한 타입정보를  내포하고 있어야한다

        //타입의 변수로 업캐스팅 될 수 있다
        //Calculator calc = new CompleteCalc();
       // CompleteCalc calc = new CompleteCalc();

        //인터페이스나 추상클래스는 인스턴스화 할 수 없다
       // Calc calc1 = new Calc();
       // Calc calc2 = new Calculator();

        System.out.println(calc.add(num1, num2));

        //calc.showInfo(); -> 안된다. Calc 타입에 선언 되어있지 않은 메서드이기 때문 - 호출하고싶으면 다운캐스팅해라

        //인터페이스 활용 - 1.디폴트 메서드 설명  //Calc 클래스 정수계산기 구현 출력
        //메소드 오버라이딩에 가상 메서드 방식에 의해서 인스턴스(CompleteCalc)의 메서드가 호출
        calc.description();

        //인터페이스 활용 - 정적메서드
        int[] arr = {1,2,3,4,5};
        int sum = Calc.total(arr);
        System.out.println(sum);

        //디폴트 메서드 , 정적메서드 공통점 : 둘다 구현코드를 제공한다
        //디폴트메서드, 정적메서드 차이 : 디폴트 메서드는 기본적인 구현코드 CompleteCalc 가 제공된다
        //정적메서드는 인스턴스 생성(객체선언)과 상관없이 인터페이스 이름만으로 호출해서 사용할 수 있는 메서드
        //private 메서드는  책에
    }
}

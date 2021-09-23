package interfaceEx;

public class CalculatorTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        //타입상속을 받았다. Calc 라는 타입
        Calc calc = new CompleteCalc(); //객체선언이 성립할려면 CompleteCalc 클래스가
                                        // Calc 에 대한 타입정보를 내포하고 있어야한다

        //타입의 변수로 업캐스팅 될 수 있다
        //Calculator calc = new CompleteCalc();
       // CompleteCalc calc = new CompleteCalc();

        //인터페이스나 추상클래스는 인스턴스화 할 수 없다
       // Calc calc1 = new Calc();
       // Calc calc2 = new Calculator();

        System.out.println(calc.add(num1, num2));

        //calc.showInfo(); -> 안된다. Calc 타입에 선언 되어있지 않은 메서드이기 때문 - 호출하고싶으면 다운캐스팅해라
    }
}

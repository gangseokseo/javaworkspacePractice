package interfaceEx;

public interface Calc {
//구현 코드가 없는 인터페이스 - 상수와 추상메서드가 선언된다

    //멤버변수 선언 - 클래스가 인스턴스로 생성될때 heap area 에 메모리가 잡히는게 멤버변수
    // 아무런 키워드를 쓰지 않아도 public static final 상수로 선언이 된다.
    double PI = 3.14;
    int ERROR = -999999999;

    //메서드 선언
    //인터페이스 키워드 안에 선언이 되면 전부 public abstract -> 추상메서드가 된다.
    //pre compile 단계에서 public abstract 가 붙는다(근데 작성하던 안하던 상관없다)
    int add(int num1, int num2);// 리턴타입, 메서드명, 매개변수
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
}

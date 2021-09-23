package interfaceEx;

public abstract class Calculator implements Calc { //getter setter -> 다 구현하지 않고 일부만 구현 -> 추상클래스화
    //보통 다 구현함(문법적 설명때문에 일부만 구현)
    //interface 타입을 상속했다 = 타입상속

    //Calculator 가 Calc 를 구현했다
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }


}

package interfaceEx;

public class CompleteCalc extends Calculator {
    //구현한코드 상속 및 Calculator 가지고 있는 추상메서드 2개 구현한다(Calculator 에서 구현안한것)
    //구현상속

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;

    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 != 0){   //나누는수가 0이되면 안되니 if조건문
            return num1 / num2;
        }

        return ERROR; //아니라면 ERROR 코드 반환
    }

    //메서드 추가
   public void showInfo(){
        System.out.println("Calc 인터페이스를 구현하였습니다");
    }
}

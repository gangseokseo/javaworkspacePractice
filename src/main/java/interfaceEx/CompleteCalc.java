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
        if(num2 != 0){   //나누는수가 0이되면 안되니 if 조건문
            return num1 / num2;
        }

        return ERROR; //아니라면 ERROR 코드 반환
    }

    //메서드 추가
   public void showInfo(){

        System.out.println("Calc 인터페이스를 구현하였습니다");
    }

    //봤을때 인터페이스에서 제공하는 디폴트 메서드가 내가 원하는 구현코드가 아니라면, 재정의 할 수 있다. 오버라이딩
    @Override
    public void description() {
        System.out.println("완벽한 계산기 입니다");

        //super.description(); //super -> Calc description
    }
}

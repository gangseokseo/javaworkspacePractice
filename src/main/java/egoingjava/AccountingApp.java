package egoingjava;
//객체지향 - 클래스와 인스턴스의 활용

class Accounting{ //밑의 공통부분을 모아서 이름붙인것이 클래스
    //부가가치세와 연관된것들을 모아둔다
    // 공급가액
    public  double valueOfSupply;
    // 부가가치세율
    public static double vatRate = 0.1;
    public Accounting(double valueOfSupply){  //this는 위에거 가리킴
        this.valueOfSupply = valueOfSupply;  // this.인스턴스 변수(멤벼변수)    = 매개변수

    }

    public  double getVAT() { //getVAT() 는 인스턴스 변수인 valueOfSupply에 접근 // static은 클래스에 소속
        return valueOfSupply * vatRate;
    }

    public  double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {


    public static void main(String[] args) {
        //valueOfSupply 를 생성자레벨에서 강제하고싶을때
        Accounting a1 = new Accounting(10000.0); //생성자 호출될때 인자를 매개변수로 위에 전달하고 싶기 때문에

        Accounting a2 = new Accounting(20000.0);


        System.out.println("Value of supply : " + a1.valueOfSupply); //valueOfSupply 는 인스턴스에 소속된 변수이다?
                                                                    //public static double valueOfSupply; -> static 을 빼준다
        System.out.println("Value of supply : " + a2.valueOfSupply);

        System.out.println("VAT : " + a1.getVAT());
        System.out.println("VAT : " + a2.getVAT());

        System.out.println("Total : " + a1.getTotal());
        System.out.println("Total : " + a2.getTotal());


//        Accounting.valueOfSupply = 10000.0;  //valueOfSupply 는 위에서 static이 붙은 클래스 변수
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        Accounting.valueOfSupply = 20000.0;  //valueOfSupply 는 위에서 static이 붙은 클래스 변수
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//
//        Accounting.valueOfSupply = 10000.0;
//        System.out.println("VAT : " + Accounting.getVAT()); //  10%인 금액을 안다(부가가치세)
//        Accounting.valueOfSupply = 20000.0;
//        System.out.println("VAT : " + Accounting.getVAT());
//
//        Accounting.valueOfSupply = 10000.0;
//        System.out.println("Total : " + Accounting.getTotal()); //공급가액 + 부가가치세
//        Accounting.valueOfSupply = 20000.0;//
//        System.out.println("Total : " + Accounting.getTotal());

        //인스턴스화
        //어떤 내부적인 상태가 세팅이 되면 (Accounting.valueOfSupply = 10000.0; 정해짐.) 여러가지 작업이 끝나고,
        //새로운 내부적 상태변화가 오면 클래스를 인스턴스화 시킬필요는 없다.

        //클래스의 상태가 계속 바뀌는 상황이 오면, Accounting 하나의 클래스가 여러의 상황에서 돌려서 사용하기때문에.
        // Accounting 하나의 클래스를 복제한 별도의 인스턴스를 만들어서 인스턴스마다 고유한 상태를 주게되면, 독립된 인스턴스를 제어한다
    }

}
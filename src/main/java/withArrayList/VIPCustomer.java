package withArrayList;

//다형성 - GoldCustomer  vip 등급과 일반등급 사이에 하나의등급을 추가해라

public class VIPCustomer extends Customer {
//상속 - 추가되는 내용만

    //상위클래스 Customer 에 있는 멤버변수들을 가져다 사용가능하기에 여기에서는 생략가능하다.

    double saleRatio; //할인율
    private int agentID; //담당 상담원 ID

    public VIPCustomer() {  // 디폴트 생성자- 고객 처음 생성

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

        // System.out.println("VIPCustomer() 생성자 호출");

    }


    public VIPCustomer(int customerID, String customerName, int agentID) {

        super(customerID, customerName);
        customerGrade = "VIP"; // 기본 등급 //customerGrade 가 private 로 선언했기때문에 보이지 않아 오류 발생
                                // protected 로 제어하면 외부클래스에서는 private 이지만 상속관계에서 public 처럼 가시성있게 된다-
                                //다른 패키지에 가도 적용된다

        bonusRatio = 0.05;  //보너스 포인트 기본 적립 비율
        saleRatio = 0.1;
        this.agentID = agentID;

        //System.out.println("VIPCustomer(int, String) 호출");//매개변수가 있는 함수가 호출이 되었다

    }

    //agentID 가 private 으로 지정된것이니 바꾸는건 제공하지 않겠다. (제공하면 set 도 추가) //????????
    public int getAgentID(){
        return agentID;
    }


    //calcPrice, showCustomerInfo 재정의 2개

    //지불가격 계산 메서드
    //메소드 오버라이딩(덮어썼다)
   public int calcPrice(int price){ //같은이름, 같은 반환값, 같은 매개변수를 가진 이런애를 재정의 할수 있다 - 메소드 오버라이딩

        bonusPoint += price * bonusRatio; //포인트 적립

       return price - (int)(price * saleRatio); //지불가격
    }

    //재정의
    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당상담원 아이디는" + agentID + "입니다";
        //super가 있어야 상위클래스를 사용한다(없으면 자기것을 무한루프)
        //구하려는거 agentID

    }

    //VIPCustomer들의 다른정보는 상위클래스 것을쓴다
}

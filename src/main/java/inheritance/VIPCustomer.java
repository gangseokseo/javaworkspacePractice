package inheritance;

public class VIPCustomer extends Customer {
//상속

    //상위클래스 Customer 에 있는 멤버변수들을 가져다 사용가능하기에 여기에서는 생략가능하다.

    private double saleRatio; //할인율
    private int agentID; //담당 상담원 ID

    public VIPCustomer() { // 디폴트 생성자- 고객 처음 생성

        super(); //생성자 호출 ->매개변수가 없다 ->상위클래스 기본 생성자 호출 // 자기 바로 위 상위 클래스를 가리키는 참조자를 가지고있는 키워드
                 // 없어도 호출 가능

        customerGrade = "VIP"; // 기본 등급 //customerGrade 가 private 로 선언했기때문에 보이지 않아 오류 발생
                                // protected 로 제어하면 외부클래스에서는 private 이지만 상속관계에서 public 처럼 가시성있게 된다-
                                //다른 패키지에 가도 적용된다

        bonusRatio = 0.05;  //보너스 포인트 기본 적립 비율
        saleRatio = 0.1;

        System.out.println("VIPCustomer() 호출");

    }

    //agentID 가 private 으로 지정된것이니 바꾸는건 제공하지 않겠다. (제공하면 set 도 추가) //????????
    public int getAgentID(){
        return agentID;
    }
/*
    오버라이딩때 구현하도록 한다

    //지불가격 계산 메서드
   public int calcPrice(int price){

       if(customerGrade == "SILVER"){
           bonusPoint += price * bonusRatio; //포인트 적립
       }
       return price; //지불가격
    }
*/

}

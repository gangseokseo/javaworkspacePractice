package withArrayList;
//다형성
public class GoldCustomer extends Customer {

    //생성자를 만들기로한다. Customer 의 생성자의 보너스포인트등 다른점이 많기에 개별적으로 만든다

    double saleRatio;

    public GoldCustomer(int customerID, String customerName){ //int customerID, String customerName 추가

        super(customerID, customerName); //이것의 assign은 Customer 클래스의 ID와 Name
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    //오버라이딩-> 가격정책이 Customer 하고는 다르다.Customer는 보너스포인트만 증가했지만, GoldCustomer 는 할인도 한다
    //
    @Override
    public int calcPrice(int price) { //반환값은 가격
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }
}

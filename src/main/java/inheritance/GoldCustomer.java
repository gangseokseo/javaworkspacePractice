package inheritance;

public class GoldCustomer extends  Customer {

    public GoldCustomer(){

        bonusRatio = 0.05;
    }

    //재정의 되었다
    //@ 어노테이션 - 주석
   @Override
    public int calcPrice(int price) {
        //재정의 파라미터가 맞는가? int price //컴파일러에게 재정의 된걸 알려주는 컴파일러가 체크되겠끔.

        return super.calcPrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}

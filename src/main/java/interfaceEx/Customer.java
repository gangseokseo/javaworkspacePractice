package interfaceEx;

public class Customer implements Buy, Sell{


    //2개를 구현해서 사용할 수 있다
    @Override
    public void buy() {
        System.out.println("판매하기");
    }

    @Override
    public void sell() {
        System.out.println("구매하기");

    }
}

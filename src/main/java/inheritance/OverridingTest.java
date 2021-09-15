package inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        //메소드 오버라이딩
/*
        Customer customerLee = new Customer(100010, "LEE");
        int price = customerLee.calcPrice(10000);
        System.out.println(("지불 금액은" + price + "이고," + customerLee.showCustomerInfo()));


        VIPCustomer customerKim = new VIPCustomer(100010, "Kim", 100);
        price = customerKim.calcPrice(10000);
        System.out.println("지불 금액은" + price + "이고," + customerKim.showCustomerInfo());
*/

        //VIPCustomer 로 생성하고 Customer 타입으로 대입을 한다 (오버라이딩 - 묵시적 형변환)
     Customer customerWho = new VIPCustomer(100010, "Who", 100);
     int price = customerWho.calcPrice(10000); //who가 얼마를 내는가 10000
        System.out.println("지불 금액은" + price + "이고," + customerWho.showCustomerInfo());; //적립되는 보너스 포인트?

    //항상 참조변수가 참조할 수 있는 내용은 자료형(타입)Customer 만 할 수 있다
    //customerWho. -> 가상함수

    }
}

package withArrayList;

//다형성

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {
       //객체 관리하기 편한 클래스 ArrayList

        ArrayList<Customer> customerList = new ArrayList<Customer>(); // 고객리스트에 Customer 타입에 상속받은 모든 종류의 객체들

        //
        Customer customerLee = new Customer(10010,"이순신");
        Customer customerShin = new Customer(10011, "신사임당");
        GoldCustomer customerHong = new GoldCustomer(10012, "홍길동");
        GoldCustomer customerYUI = new GoldCustomer(10013, "이율곡");
        //vip하나 만든다
        VIPCustomer customerKim = new VIPCustomer(10014, "김유신", 12345);

        //인스턴스 5개
        //위 객체들을 전부 CustomerList 에 넣을 수 있다.

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYUI);
        customerList.add(customerKim);

        System.out.println("========고객정보 출력======");

        //향상된 for문  customer 타입에 customerList 에 있다
        for(Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }
        System.out.println("=====할인율과 보너스 포인트 결과 ===="); //calcPrice ??  각각 메서드마다 계산하는게 아니다
        int price = 10000;

        for(Customer customer : customerList){
            //오버라이딩 됬을때 인스턴스의 메서드가 불리운다, calcPrice 가 오버라이딩 (재정의) 되었으니 자연히 불리운다
            int cost = customer.calcPrice(price); // cost = 가격

            System.out.println(customer.getCustomerName() + "님이" + cost + "를 지불하셨습니다");
            System.out.println(customer.showCustomerInfo());//나머지 정보
            // 10000원을 넣었을때 각각 얼마인가가 나온다 (반환값은 가격)
        }
    }
}

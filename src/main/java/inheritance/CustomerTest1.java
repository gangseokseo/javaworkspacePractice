package inheritance;

public class CustomerTest1 {
    //상속 테스트
    public static void main(String[] args) {

        //왜 set?? 데이터입력?
/*
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10100);
        customerLee.setCustomerName("Lee");
*/

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerID(10101);
        customerKim.setCustomerName("Kim");
        customerKim.bonusPoint = 1000; //변수 엑세스해서 포인트 출력
        //VIP 생성자 를 이용해서 VIP클래스 안을 생성했는데 Customer 의 멤버변수를 전부 사용할 수 있다. 어떻게 가능한가?
        //상속을 받았긴한데 어떻게? 하위클래스가 생성될때 상위클래스가 먼저 생성이 된다


        //System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());

        //08-2 상속에서 클래스 생성과 형변화
        //하위클래스가 생성될때 무슨일이 일어나는가
    }
}

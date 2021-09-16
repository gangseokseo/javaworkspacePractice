package withArrayList;

//다형성
public class Customer {
//상속 - 공유되는 내용만
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
     int bonusPoint;
    double bonusRatio;


    public Customer() { // 디폴트 생성자- 고객 처음 생성

        //super(); // 자바의 최상위 클래스 Object에 상속을 받는다

        customerGrade = "SILVER"; // 기본 등급
        bonusRatio = 0.01;  //보너스 포인트 기본 적립 비율

       // System.out.println("Customer() 호출");
    }


    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        //System.out.println("Customer(int, String) 호출");//매개변수가 있는 함수 호출
    }


    //지불가격 계산 메서드
   public int calcPrice(int price){
       bonusPoint += price * bonusRatio; //포인트 적립

       return price; //지불가격 왜? 리턴
    }


    public String showCustomerInfo(){ //고객의 정보를 반환하는 메서드
        return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";

    }

    //getter setter 기능 // 왜 보너스포인트와 보너스 비율은 없지?
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

}

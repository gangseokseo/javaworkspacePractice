package cooperation;

public class Bus {

    //버스 노선번호, 승객수, 벌어들인 돈

    int busNumber;
    int passengerCount;
    int money;

    //버스는 생성자 1개, 메서드2개

    public Bus(int busNumber){ //모든버스는 번호를 가져야지만 생성되니 매개변수 busNumber를 넣어준다)

        this.busNumber = busNumber;
    }

    //승객이 1명 탑승했을때 돈을받는다. 이에 호출되는 take메서드
    public void take(int money){
        passengerCount++; //승객수 증가
        this.money += money; //돈 증가

    }

    public void showInfo(){
        System.out.println("버스" + busNumber + "번의 승객은" + passengerCount + "명이고, 수입은"
                            + money+ "입니다");
    }
}

package template;

public class ManualCar extends Car {
    //사람이 운전하는 차

    @Override
    public void drive() {
        System.out.println("사람이 운전합니다");
        System.out.println("사람이 핸들을 조작합니다");
    }

    @Override
    public void stop() {
        System.out.println("사람이 브레이크로 정지합니다");
    }

    @Override
    public void wiper() {
        System.out.println("사람이 수동으로 와이퍼를 조작합니다");

    }

    //public void run(){} - final 이 걸린 메서드는 오버라이딩 할 수 없다
}

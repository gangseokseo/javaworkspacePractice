package template;

public class CarTest {

    public static void main(String[] args) {

        //run(); 시나리오는 똑같다.
        Car myCar = new ManualCar();
        myCar.run();

        System.out.println("=================");

        Car yourCar = new AICar();
        yourCar.run();
    }
}

package loopexample;

import classpart.BenzCar;
import classpart.Car;
import classpart.ZipCar;

public class WhileExample {
    public static void main(String[] args) {

//        Car car = new ZipCar(Integer);


        Car car2 = new BenzCar();

        int num = 1;
        int sum = 0;

        while( num <= 10){

            sum += num;
            num++; //하나씩 증가해라

            //왜 sum이 오류날까? sum이 초기화가 안되있기 때문이다. 얼마에 더해줄지 모른다->반드시 초기화 필요
            //( num <= 10)이 참이기때문에 계속 중괄호 안에서 반복될 수 있다


        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다");
        //while문을 빠져나온순간 실행되는 문장이 나온다 . 괄호안에 쓰면 계속 반복되서 출력된다.
   }
}

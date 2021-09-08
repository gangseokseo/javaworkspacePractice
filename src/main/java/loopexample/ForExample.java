package loopexample;

public class ForExample {

    public static void main(String[] args) {
         int num;
         int sum; //초기화할게 있다면 for문에 넣어라

         for (num = 1, sum =0; num <= 10; num++){

             sum += num;

         }
        System.out.println(sum);
        System.out.println(num); //후위증감연산자 num값을 필요한곳에 사용한 다음 num값을 증가시킨다.

    }

}

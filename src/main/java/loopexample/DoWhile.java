package loopexample;

public class DoWhile {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        do{
            sum += num;
            num++; //하나씩 증가해라

        }while(num < 1);

        System.out.println("1부터 10까지의 합은 " + sum + "입니다");
        //do while 문은 조건체크를 나중에 하기때문에 반복블럭안의 수행문이 '무조건' 한번은 수행된다.
        // while문은 조건체크 부터 들어가는것이 차이
    }
}

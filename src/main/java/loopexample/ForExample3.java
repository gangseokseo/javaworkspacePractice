package loopexample;

public class ForExample3 {
    //for문 -while문변화는 노션에
    //연습문제 2번 구구단을 짝수단만 출력하도록 만들기
    //연습문제 3번 구구단을 단보다 곱하는 수가작거나 같은경우까지만 출력하도록 하기

    public static void main(String[] args) {

        int dan = 2;
        int times = 1;

        while(dan <=9){

            times = 1;
            while ( times <= 9){
                if(times > dan ) break;
                System.out.println(dan + "x" + times + "=" +dan*times);
                times++;
            }
            dan++; //break 는 반복문 중괄호안에서 돌기 때문에 반복문만 실행안되고  dan++는 그대로 진행된다.
            System.out.println(); //개행한다는 뜻

        }
    }

}

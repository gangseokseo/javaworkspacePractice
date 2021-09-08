package loopexample;

public class BreakExample {
    public static void main(String[] args) {

        //계속 더해서 어느순간에 100을 넘길때, 그때 num은 얼마인가?
        int sum = 0;
        int num = 1;

        while(true) {
            sum += num;

            if(sum > 100)
                break;//sum이 100을 넘으면 멈추고 나가라. 밑에 num은 후위증감이 안된다

            num++;

        }
        System.out.println(sum); //105
        System.out.println(num); //14 까지 더해야 100을 넘는다
        //조건문에다  쓰면 num이 증가한후 조건을 체크하니 정확한 부분을
        //캐치하지 못한다
    }


}
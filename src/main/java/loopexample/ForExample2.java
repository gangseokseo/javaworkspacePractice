package loopexample;

public class ForExample2 {
    public static void main(String[] args) {

        int dan;
        int times;

        for(dan = 2; dan <=9; dan++){

            for(times = 1; times <=9; times++){
                System.out.println(dan + "x" + times + "=" +dan*times);
            }
            System.out.println(); //개행한다는 뜻

            //while문 변화
        }
   }
}

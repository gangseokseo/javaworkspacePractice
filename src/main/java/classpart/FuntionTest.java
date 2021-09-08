package classpart;

public class FuntionTest {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        //밑의 함수를 쓰고싶으면 불러라(위에 num1, num2를 받는다- 밑의 n1,n2와는 변수명 상관이없다. n1,n2는 위의값을 복사해서 받는역할)
        //int sum => 반환값을 받는다,  sum 에 result값이 들어간다
        int sum = addNum(num1, num2);
        System.out.println(sum); //최종결과 40

    }

    //함수하나 만듬(2개 더해서 값나오는)

    //함수명 addNum
    //매개변수 n1, n2 ,result의 자료형은 int이니 addNum앞도 int
    //반환하는 값이 없으면 반환데이터타입 int 대신에 void , public static void addNum
    //매개변수까지가 '함수를 선언한다'라고도 쓰인다
    //구현코드가 다쓰이면 '함수를 정의한다'라고 한다

    public static int addNum(int n1, int n2) {
        int result = n1+ n2;
        return result; //반환값

        //마지막
        //result값(10+30)은 return해서 위의 addNum의 반환값으로해서 sum으로 들어간다

    }

    // num1, num2 는 메인에서 선언한 변수이며, n1, n2는 addNum에서 선언한 변수이고 역할은 num1과 num2를 복사해서 받는다
}

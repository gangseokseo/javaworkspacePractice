package singleton;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        //싱글톤 패턴은 객체가 단 1개만 생성되도록 하자.

        Company c1 = Company.getInstance(); // 객체를 생성하지 않고 클래스이름으로 엑세스할수 있다
                                            //Company 클래스의 static 메서드 가져오기

        Company c2 = Company.getInstance();

        System.out.println(c1);
        System.out.println(c2);
        //둘다 같은 인스턴스를 가리키고, 동일한 값이다


        Calendar cal =  Calendar.getInstance(); //생성자는 없고 .getInstance한다?

    }

}

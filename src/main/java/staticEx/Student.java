package staticEx;

public class Student {

    private static int serialNum = 10000; //기준값 10000으로 시작
    int studentID;
    String studentName;

    //클래스에서 생성자 호출될때만 학생은 증가한다
    public Student(){
        serialNum ++;//증가된 serialNum은 모든 인스턴스에서 공유되는 값 //학생이 생성될때마다 증가

        studentID = serialNum;//studendID값은 serialNum에서 복사되서 각각 인스턴스마다 갖고있는다
                                //학번은 학생고유번호이므로 멤버변수로 선언해주고, 학생이 한명씩 생성될때마다
                                //증가한 serialNum값을 studentID에 대입해주면 된다.
    }


    //private으로 선언하면 객체 외부에 오픈되면 문제가 될수 있는 변수. 외부에서 쓸수 없는데
    // 값을 한번출력해 보고싶다 -> getter setter->serialNum 만든다. 가져가서 볼수만 있게 get만 쓴다 .수정 set은 하지말것.





    //static메서드에서  인스턴스 변수를 사용할 수 없다

    //변수의 종류 3가지
    public static int getSerialNum() {
        int i =10; // i는 지역변수 , 지역변수는 메서드 호출시 생성된다. 끝나면 사라진다.

        i++;
        System.out.println(i);

        //studentName = '홍길동'; //인스턴스 변수 = 멤버변수 , 인스턴스가 new예약어 붙을때 생성되는데 studentTest에서 사용되므로.
                                //생성되지 않은 인스턴스에 홍길동이란 변수를 넣는 걸로 인해 오류

        return serialNum; //serialNum은 static 변수 = 클래스 변수
    }


}

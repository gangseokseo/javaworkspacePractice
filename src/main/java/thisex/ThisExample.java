package thisex;

class Birthday{//자기자신에게 생성된 인스턴스 메모리를 가리키는 this
    //객체를 코드로 만든 클래스
    //빈껍데기 클래스는 설계도
    int day;
    int month;
    int year;

    public void setYear(int a){// 매개변수인가?
        this.year = a;
        //this의 뜻 -> 인스턴스가 생성되어 가지게된 자기자신의 메모리에  year의 멤버변수값에 우항 a를 넣어라.

        //year = year; 코드는 자기와 가까운곳을 참조
        // 컴파일 오류는 안났는데 틀렸다. 왜? 멤버변수가 아닌 지역변수에 assign된다


        //이런 경우는 상관이없다
        /*
            public void setYear(int y){// 가리키는거 제대로 year를 가리킴
            this.year = y;
         */
    }

    //this출력 메서드
    public void printThis(){
        System.out.println(this); //this 현재 자기 인스턴스의 주소값을 가리킨다
    }

}



public class ThisExample { //this 출력값의 의미를 알기 위해 main()함수를 포함하여 만든 테스트용 클래스.
    public static void main(String[] args) {

        Birthday b1 = new Birthday();
        Birthday b2 = new Birthday();

        System.out.println(b1); //b1의 주소값 출력

        //b1의 this값 (this 출력메서드 이용)
        b1.printThis(); //값이 같다. thisex.Birthday@1b6d3586

        System.out.println(b2);
        b2.printThis();

        //코드는 똑같은 this지만, 매번 가리키는건 그때의 인스턴스의 주소값이다
    }
}

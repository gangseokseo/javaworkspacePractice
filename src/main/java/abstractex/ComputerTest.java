package abstractex;

public class ComputerTest {

    public static void main(String[] args) {

        //컴퓨터클래스는 추상클래스. 추상클래스는 인스턴스화 할 수 없다
        //Computer c1 = new Computer();

        Computer c2 = new DeskTop();//상속의 상위클래스, 하위클래스 업캐스팅 관계와 같다
        //Computer c3 = new NoteBook();

        NoteBook c4 = new MyNoteBook(); // 상위클래스인 컴퓨터타입,노트북타입으로 대입가능

        //c1.display();
        //display는 구현코드가 없다 -> 실행될 명령어가 없다

        //컴퓨터에 디스플레이 구현코드 없으니 데스크탑과 마이노트북 디스플레이가 구현이 된다
        //상속과 다형성의원리가 온다
        c2.display();
        c4.display();


        //어디서, 어떻게 쓰이냐?
        //상위클래스에서는 어떻게 보여주겠다만 정의, 하위클래스는 구체적으로 뭘 보여주겠다. 하위클래스에 위임한다
    }
}
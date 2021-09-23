package abstractex;

//추상클래스를 왜 만들까? 상속을 하기 위해서 . 자기가 혼자서 작동하는 클래스가 아니다(인스턴스화 될 수 없다)
//그 대신 선언된 추상클래스를 바탕으로 하위클래스가 추상클래스를 기반 한 클래스를 구현한다

public abstract class Computer { //추상메서드를 가졌으니 추상클래스여야 한다.

    //구현코드가 없으면, 추상메서드- 구현코드가 있다면 {}body 를 넣어라
    public abstract void display(); //{}이 없다. 구현을안하고, 메서드 선언만 한다는 뜻[메서드 이름, 매개변수, 반환값 만안다]
    public abstract void typing();

    //메서드 선언 예시
    // int  -> int 반환값
    /*
   구현코드 없는 추상메서드가 구현코드가 있다면 어떤 매개변수를 받아서 반환을 할것이다 라는 의미
    public int add(int x, int y){
        return  x+y;
    }
   =
    public abstract int add(int x , int y);

     */

    //2개의 구현된 일반메서드-구현코드는 공통이다.
    public void turnOn(){
        System.out.println("전원을 켭니다");
    }

    public void turnOff(){
        System.out.println("전원을 끕니다");
    }
}
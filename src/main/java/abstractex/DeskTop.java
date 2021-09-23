package abstractex;

public class DeskTop extends Computer{ //상속받은 기능들의 구현에 대한 책임이 있다

    @Override
    public void display() {
        System.out.println("DeskTop display()");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing()");
    }

    //상위 클래스에서 구현되었지만 필요에 의해서 하위클래스에서 '재정의' 할 수 있다. 오버라이딩
    public  void  turnOn(){

        System.out.println("DeskTop turnOn()");
    }
}
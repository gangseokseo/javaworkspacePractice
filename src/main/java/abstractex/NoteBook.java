package abstractex;

public abstract class NoteBook extends Computer {

    //Computer 에 받은 2개의 추상메서드를 하위클래스(NoteBook, DeskTop) 에서 구현해라
    // NoteBook 에서는 1개만 구현하니 오류표시 -> 추가로 구현하든가, NoteBook도 추상클래스가 되어라

    @Override
    public void display() {
        System.out.println("NoteBook display()");
    }

    public void aaa(){}

}
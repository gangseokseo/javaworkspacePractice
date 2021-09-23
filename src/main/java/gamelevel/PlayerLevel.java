package gamelevel;

public abstract class PlayerLevel {
    //구현할수 있는 부분과 없는 부분을 생각.
    //상위클래스

    //각 레벨에서 구현
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();



    //템플릿 메서드. MainBoard 의 play
    final public void go (int count){
        run();
        for(int i = 0; i < count; i++){
            jump();
        }
        turn();
    }

}

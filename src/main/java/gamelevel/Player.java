package gamelevel;

public class Player {
    // level 을 변수로 가진다. level 은 여러타입이 될 수 있다 -> 상위클래스인 playLevel 의 타입으로 선언한다.

    //변수를 PlayerLevel 로 잡는다? 타입?
    //상위클래스 PlayerLevel 을 참조한다. 핸들링한다
    private PlayerLevel level;

    //기본생성자. 플레이어가 처음 만들어질때
    public Player(){

        level = new BeginnerLevel(); //level 초기화를 위해서 //PlayerLevel 타입에다가 BeginnerLevel 을 대입함.
                                     // BeginnerLevel 은 상속을 받았다?
        level.showLevelMessage();    //레벨이 바뀔때마다 보여준다.
    }

    public PlayerLevel getLevel() {
        return level;
    }

    //setLevel 을 upgradeLevel 로 메서드 이름을 바꿔준다. 매개변수 자료형(타입) - PlayerLevel
    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    //MainBoard 의 play 메서드 구현, 파라미터 타입 i에서 count로 바꾸기
    public void play(int count) {
        level.go(count); //PlayerLevel 에서 만들었던 go 메서드 호출
        // 가상메서드에 의해  각 레벨 클래스에 구현된 레벨별 기능이 호출 된다.

        //정리
        // 가상메서드에 의해  각 레벨 클래스에 구현된 여러 클래스를 하나의 자료형(상위클래스 자료형)으로 선언하거나 대입할 수 있다
        //추상클래스에 선언된 메서드를 호출 하면 가상메서드에 의해 각 클래스에 구현된 기능이 호출됩니다.
        //즉 하나의 코드가 다양한 자료형을 대상으로 동작하는 다형성을 활용활 수 있는 것입니다.
        //player 클래스와 playerLevel 클래스에 다형성이 구현되어 있다.

    }


}

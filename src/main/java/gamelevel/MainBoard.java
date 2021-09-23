package gamelevel;

public class MainBoard {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);//테스트 코드는 읽는거니까 상관없다?

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2); //점프 2번 한다

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3); // 점프 3번 한다


    }
}

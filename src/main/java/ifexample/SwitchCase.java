package ifexample;

public class SwitchCase {
    public static void main(String[] args) {
        int rank = 1;
        char medalColor;

        switch (rank) {
            case 1: medalColor = 'G';
                break;
            case 2: medalColor = 'S';
                break;
            case 3: medalColor = 'B';
                break;
            default: medalColor = 'A';

        }
        System.out.println(rank + "등 메달의 색깔은" + medalColor + "입니다.");
        //break문은 switch-case문을 빠져나올때 쓴다. 안쓰면 만날때까지 계속 수행된다. 무조건 필요.
    }
}

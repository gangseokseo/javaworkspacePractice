package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
//탑승하는 모습 구현함

        Student james = new Student("James", 5000);
        Student tomas = new Student("Tomas", 10000);

        //2사람이 탈수 있는 버스 1대, 100번 버스
        Bus bus100 = new Bus(100);
        james.takeBus(bus100); //생성된 100번 버스가 들어가야한다 ??????
        //100번버스에서 student클래스의 takebus 자기메서드를 부르고,
        //bus클래스의 take메서드 돈과 승객을 증가시키는 것이 호출된다.
        james.showInfo();
        bus100.showInfo();

        //2호선은 초록색
        Subway subwayGreen = new Subway(2);
        tomas.takeSubway(subwayGreen);
        tomas.showInfo();
        subwayGreen.showInfo();

        //최종정리
        // 인스턴스 총 4개 생성 -> 학생 2명, 버스1대, 지하철1대-> 학생이 버스를타는경우, 지하철 타는경우 각각

    }

}

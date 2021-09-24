package scheduler;

import java.io.IOException;

public class SchedulerTest {

    public static void main(String[] args) throws IOException { //예외 처리

        //R, L, P 출력
        System.out.println("전화 상담 배분방식을 선택하세요. R, L, P");

        //받을때 (integr 타입으로 받아서 읽는다)
        int ch = System.in.read();
        //scheduler 변수명 임의로 만들기 // scheduler 타입에 그때마다 다른 인스턴스(RR,LeastJob,Priority) 가 대입된다
        Scheduler scheduler = null;  //null로 초기화

        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("지원하지 않는 기능입니다");
            return; //함수 수행종료 목적의 return. return 뒤에 반환값은 없다 p.136
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
        //다형성 - 난 똑같은 메서드를 불렀지만, 각 인스턴스에 따라서 해당되는 구현코드가 달라진다.

        //실체없는 인터페이스로 어떻게 DB를 연결하느냐?
        //connection, statement 도 인터페이스-구현은 오라클이나 my sql 등 이런곳에서 한다
    }
}


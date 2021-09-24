package scheduler;

public interface Scheduler {

    //기능 2가지(다음고객 콜가져오기, 상담원에게 콜 던지기)-2개의 메서드 구현
    //여러 클래스에서 공통으로 사용되는 디폴트 구현 코드
    void getNextCall();
    void sendCallToAgent();

}

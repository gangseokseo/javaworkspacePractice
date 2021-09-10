package singleton;

public class Company {
    //싱글톤 패턴은 객체가 단 1개만 생성되도록 하자.

    //변수 이름 상관없음
    private static Company instance = new Company(); //전체에서 유일하게 사용될 인스턴스, 단1개만 있을것이므로 static

    //private 생성자 - 외부에서 호출하지 못하게 하겠다
   private Company(){}

    //외부에서 가져다 쓰기위해서 public , getInstance 메서드 1개를 만들어라
    //리턴타입(반환형)은 Company -> Company 클래스 = 클래스형 참조 자료형 변수?
    public static Company getInstance(){

       if(instance == null)
           instance = new Company(); // null일시 객체생성해서 assign해주기기

      return instance; //생성된 instance 객체를 외부에 가져다 쓸 수 있다
                        //반환값 return 예약어 언제, 왜 쓰이는지?

        //객체를 생성하지 않고도 부르는 방법 static 붙이기
    }

}

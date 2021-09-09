package thisex;

class Person{

    String name;
    int age;

    public Person(){

        this("이름없음", 1); //this를 쓰는 생성자일땐 그 어떤 statement문장 도 올 수 없다
                                        // 생성자에서 다른생성자를 호출하는 this를 쓸때 가장먼저 나오는 statement여야 한다

    } //디폴트 생성자

    public Person(String name, int age){//이름과 나이를 초기화해주는 생성자
        this.name = name;
        this.age = age;

    }

    //자기자신 주소반환(메소드이름임의 returnSelf)
    public Person returnSelf(){ //데이터 타입은 자기자신 클래스인 자료형 person
                                //자기자신의 클래스로 반환형을 잡아라.
                                // returnSelf함수가 반환하는것은 person의 메모리주소 즉 person자신이기때문에 return type이 Person이 되는것
        return this; //현재 인스턴스의 주소값
    }

}


public class CallAnotherConst {

    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println(p1.name); //"이름없음" 으로 초기화되서 나타난다

        System.out.println(p1.returnSelf());

    }
}

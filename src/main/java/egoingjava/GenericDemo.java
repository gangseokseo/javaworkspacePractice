package egoingjava;
//제네릭 사용이유 - 컬렉션 프레임워크전
class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person{
    public Object info; // Employinfo와 StudentInfo 공통의 조상을 데이터 타입으로 지정.없으니 모든 클래스들의 공통의 조상 Object 사용
                        // info로는 어떠한 클래스에 인스턴스도 올 수 있다
    Person(Object info){ this.info = info; }
}
public class GenericDemo {
    public static void main(String[] args) {
        Person p1 = new Person("부장"); //부장 잘못 넣은것, 문법적으로는 아무런 잘못도 없다.제대로 검출되지않아서 문제 야기

        EmployeeInfo ei = (EmployeeInfo)p1.info; //Person 클래스의 info를 가져오고 싶다.
                                                //p1.info는 Object는 일반적 데이터타입, ei에 담길 데이터는 EmployeeInfo 라는 구체적 데이터 타입이기 때문에
                                                //(EmployeeInfo) 형변환을 해야한다

        System.out.println(ei.rank);

        //오류 검출 x -타입이 안전하지 않다 (type safety)
    }
}
//StudioPerson과 EmployPerson은 동일한 메커니즘을 갖고있는 코드.이 2개를 대표할 수 있는 클래스가 존재할 수 있다.
//공통 클래스 작성하면 유지보수에 편하다

package cooperation;

public class Student {

    String studentName;
    int grade;
    int money;

    //생성자가 없을시 컴파일러가 디폴트 생성자를 만든다. 밑과 같이 직접만들경우 나타나지 않는다
    //학생을 한명 생성할때 반드시 생성자에서 매개변수를 받아 학생이름과 돈이 얼마있는지 알아야겠다

    public  Student(String studentName, int money ){
        this.studentName = studentName;
        this.money = money;
    }

    //객체의 협업을 나타내는 메서드(학생클래스에서 버스클래스 메서드 호출하여 take가 일어난다
    //버스나 지하철을 타는 행위
    //버스가 여러대인데 특정버스를 타야한다. 그럼 그 정보가 필요하다- 매개변수로 받는다
    public void takeBus(Bus bus){ //이때 들어온 Bus는 객체이다
        bus.take(1000); //bus객체의 take메서드 호출. take한 버스에다 1000을준다
        money -= 1000; //버스타는데 1000원을 사용한다

    }
    public void takeSubway(Subway subway){ //생성된 인스턴스가 매개변수로 들어와야한다.
        subway.take(1500);
        money -= 1500;
    }

    public void showInfo(){
        System.out.println(studentName + "님의 남은 돈은" + money + "입니다");
    }

}

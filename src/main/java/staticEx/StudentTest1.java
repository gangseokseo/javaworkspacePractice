package staticEx;

public class StudentTest1 {

    public static void main(String[] args) {
//인스턴스 생성하면 자동적으로 id가 10001,10002 차례대로 나오게하기
//static변수나 static 메서드는 클래스이름으로 직접 호출해서 사용한다

        System.out.println(Student.getSerialNum());//get으로 가져온다
                                                    //이 메서드는 인스턴스 생성과 관계없이 클래스이름으로 참조해서
                                                    // 참조해서 쓴다

        Student studentJ = new Student(); //studentJ 제임스 학생
        System.out.println(studentJ.studentID); //serialNum예시  //10001
        //static메서드는 참조변수보단 클래스 이름으로 쓰는게 낫다

        //System.out.println(studentJ.serialNum);


        Student studentT = new Student();
        System.out.println(studentT.studentID);//10002



    }
}

package egoingjava;

class Foo{
    //static 변수, 아닌거
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";

    //static 메서드, instance 메서드
    public static void classMethod(){
        System.out.println(classVar); //static 클래스 메서드안에서 클래스 변수 접근가능
//        System.out.println(instanceVar);    //인스턴스변수에는 접근이 안된다
    }
    public void StaticMethod(){     //인스턴스 메서드안에서는 클래스 변수와 인스턴스 변수 모두 접근 가능하다
        System.out.println(classVar);
        System.out.println(instanceVar);
    }

}

public class StaticApp {

    public static void main(String[] args) {
        System.out.println(Foo.classVar); // Foo 클래스를 통해서는 클래스변수로 접근이 가능하다
       // System.out.println(Foo.instanceVar); // Error, 인스턴스는 인스턴스를 통해서 가능하도록 고안되었다.
        Foo.classMethod();
//        Foo.instanceMethod(); //인스턴스 메서드는 인스턴스 소속이기때문에 클래스로 접근이 불가능하다

        Foo f1 = new Foo();
        Foo f2 = new Foo();
//
        System.out.println(f1.classVar); // I class var
        System.out.println(f1.instanceVar); // I instance var
//
        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar); // changed by f1
        System.out.println(f2.classVar);  // changed by f1
//
        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar); // changed by f1
        System.out.println(f2.instanceVar); // I instance var //f2는 f1과는 독립적인 변수 운영하기 때문에 바뀌지 않는다
    }

}
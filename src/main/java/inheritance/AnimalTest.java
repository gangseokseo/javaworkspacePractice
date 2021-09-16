package inheritance;

//다형성 -클래스기능추가할때 필요
//다운캐스팅 -
//각각의 클래스마다 다른 기능이 추가될 수 있다다
import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다");
    }
}

class Human extends Animal{
    public void move(){
        System.out.println("사람이 두발로 걷습니다");
    }
    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이가 네발로 뜁니다");
    }
    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 날읍니다");
    }

    public void flying(){
        System.out.println("하늘을 날아갑니다.");
    }

}

//3개의 인스턴스 생성
public class AnimalTest {

    public static void main(String[] args) {

    AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());

       // Animal animal = new Human(); 밑의 메서드와 같다
       //배열 및 어레이리스트로 다형성 사용하는법

        //배열
       Animal[] animalList = new Animal[3];
       animalList[0] = new Human();


       //
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Tiger());

    }
   //메서드 생성
    //매개변수의 타입은?위의 매개변수가 들어오는 거나 다름없다. human 이나 eagle, tiger가 들어온다 -> Animal animal
    public void moveAnimal(Animal animal){

        animal.move();//다형성-재정의된 메서드가 호출됨

        //animal이 human이냐고 묻는 코드가 필요하다 다운캐스팅
        if(animal instanceof  Human){
            Human human = (Human)animal;
            human.readBook();
        }
        else if (animal instanceof  Tiger){
            Tiger tiger = (Tiger)animal;
            tiger.hunting();
        }
        else if (animal instanceof  Eagle){
            Eagle eagle = (Eagle)animal;
            eagle.flying();
        }
        else {
            System.out.println("지원되지 않는 기능입니다.");
        }

    }

}

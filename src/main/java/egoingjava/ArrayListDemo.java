package egoingjava;

//배열과 컬렉션 프레임워크
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        //arrayObj[2] = "three"; //오류가 발생한다. java.lang.ArrayIndexOutOfBoundsException

        //arrayObj.length 배열이 몇개의 값을 담는가?
        for(int i=0; i<arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }

        //컬렉션 프레임워크 기능 ArrayList : 몇개의 값을 넣을지 지정할 필요가 없다 (배열은 아니다)
        ArrayList<String>  al = new ArrayList<String>(); //ArrayList 에 대한 인스턴스를 al에 담았다. //ArrayList는 어떠한 형태의 데이터 타입도 받는다
        //<String> 제네릭으로 String 타입 지정- 노션참조



        //데이터 추가
       al.add("one");
        al.add("two");
        al.add("three"); //많은 데이터를 추가해도 오류가 안난다

        //al.size()  - ArrayList에 몇개의 값이 담겨져 있는가가
        //size() 메서드 호출 ArrayList()안에 몇개의 값이 현재 저장되어있는가를 알아 낼 수 있다.
       for(int i=0; i<al.size(); i++){

        //ArrayList에 추가한 데이터 타입은 문자열-> 가져오려는 데이터 문자열
            String value =  al.get(i); //오류 발생?

            System.out.println(value);
        }
    }

}
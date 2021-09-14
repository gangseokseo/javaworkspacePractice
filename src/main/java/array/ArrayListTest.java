package array;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        //String[] slist = new String[10]; // String 배열을 직접 선언한 순수배열

        ArrayList<String> list = new ArrayList<String>(); //ArrayList 에서  String 타입을 가져다 사용하겠다
                                                        //제너릭 타입에서 어떤타입을 사용하겠다고 명시하지 않을 수도 있다 (String 지우기)
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //처음부터 끝까지 순회
        //함수를 직접쓴다 // 다른방법 for(String s : list)
        for(int i = 0; i< list.size(); i++){ //size가 가리키는 게 뭐지?
            System.out.println(list.get(i)); //빼내다?

           // System.out.println(list[i]); // 이건 안된다. ArrayList에서는 인덱스 연산자를 제공하지 않는다.  순수배열에서만 가능하다
           //타입 지정하지 않을시 꺼내온타입 인식못해서 String부여,String s = list.get(i); //최근에는 잘 사용 안한다
        }
    }
}

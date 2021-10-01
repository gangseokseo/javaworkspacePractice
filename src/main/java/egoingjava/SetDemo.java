package egoingjava;

//컬렉션프레임워크 Set (List와 Set의 차이점)

import java.util.ArrayList;
import java.util.Iterator;

public class SetDemo {
//컬렉션프레임워크 set이란 4
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(2);
        A.add(2);
        A.add(3);

        Iterator hi = (Iterator) A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }

    }


}
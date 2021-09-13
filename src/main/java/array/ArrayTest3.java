package array;

public class ArrayTest3 {
    //문자 배열 사용

    public static void main(String[] args) {

        char[] alphabets = new char[26]; //26개짜리 알파벳이 있는데 . a부터 z까지 넣어라
        char ch = 'A'; //65

        for (int i = 0; i < alphabets.length; i++, ch++) { //그다음 B를 넣고 싶으면 ch++필요
            alphabets[i] = ch; //알파벳의 i번째 에다가 ch값을 넣는다

        }
        for (int i = 0; i < alphabets.length; i++, ch++) {
            System.out.println(alphabets[i]);

        }


    }

}

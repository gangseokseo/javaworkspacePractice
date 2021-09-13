package array;

public class ObjectCopy {
    public static void main(String[] args) {

        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        //bookArray1에 위의 엘리먼트들이 다 들어갔다
        bookArray1[0] = new Book("태백산맥1" , "조정래");
        bookArray1[1] = new Book("태백산맥2" , "조정래");
        bookArray1[2] = new Book("태백산맥3" , "조정래");

        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        //System.arraycopy(bookArray1, 0, bookArray2,0,3); // 3개를 그대로복사 위치까지 그대로.

        for(int i = 0 ; i< bookArray1.length; i++){ //출력문으로 sout. showBookInfo 메서드를 만들었기 때문에 굳이
                                                    // 안써줘도 되고 호출만 해라.

            bookArray2[i].setAuthor(bookArray1[i].getAuthor()); //bookArray1 각각 값을 가져와서 넣어준다
            bookArray2[i].setBookName(bookArray1[i].getBookName());

        }

        //bookArray1 배열1개의 책과 저자이름을 바꾼다
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

      /*  for(int i = 0 ; i< bookArray1.length; i++){
            bookArray1[i].showBookInfo();
        }

        //bookArray1과 bookArray2 값이 같다. 그러나 값이 복사 된게 아닌 주소값이 복사된 것이다. - 얕은 복사
        System.out.println("===========");
        for(int i = 0; i < bookArray2.length; i++){
            bookArray2[i].showBookInfo();
        }
       */

        //향상된 for문 (객체배열, 기본배열)
        //전체적인 배열 순회시 사용해라
        String[] strArr = {"Java", "Android", "C"};
        for (String s : strArr){ //String 변수 선언 : 배열

            System.out.println(s);
        }

        int[] arr = {1, 2, 3, 4, 5};
        for(int num : arr) { //num = arr[i]; 대입
            System.out.println(num);
        }

    }
}

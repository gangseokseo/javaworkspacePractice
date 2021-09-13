package array;

public class BookArray {
    public static void main(String[] args) {

        Book[] library = new Book[5]; //자료형은 book array // 책이 5권만들어지는게 아니다. 책이 5권 만들어질 주소자리 5개이다
        // 객체는 내가 5개 만들었다고해서 그대로 만들어지는게 아니다. 다시 객체를 생성(주소값을 들어갈것)을 해서 배열에다 각각 넣어주어야한다

        for(int i = 0; i< library.length; i++){ //1.생성하자마자 출력하니 null이다
            System.out.println(library[i]);
        }

        //배열에 각각 넣기
        library[0] = new Book("태백산백1", "조정래");
        library[1] = new Book("태백산백2", "조정래");
        library[2] = new Book("태백산백3", "조정래");
        library[3] = new Book("태백산백4", "조정래");
        library[4] = new Book("태백산백5", "조정래");

        for(int i = 0; i < library.length; i++) { //2.하나씩 인스턴스 생성해서 각배열요소에 넣어주니 주소값 array.Book@1b6d3586 등등이 나온다
            System.out.println(library[i]);
        }
        for(int i = 0; i< library.length; i++){ //3. 최종 : 각 배열의 요소를 꺼내서, 그 요소의 메서드를 호출하면 나온다
            library[i].showBookInfo();
        }
    }
}

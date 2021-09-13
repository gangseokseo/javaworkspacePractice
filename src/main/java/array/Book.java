package array;

public class Book { //객체 배열. Book 클래스 속성 2개 만들기

    private String bookName;
    private String author;

    //생성자 2개
    public Book() {} //디폴트 생성자 제공

    public Book(String bookName, String author){ //매개변수를 받는 생성자
        this.bookName = bookName;
        this.author = author;

    }

    //private 이니 외부에서 접근이 필요하니 메서드가 필요.
    //private 멤버변수들을 위한 get set 제공해주어야 한다 (getter setter)


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public  void showBookInfo(){ //멤버변수 2개를 출력하는 메서드 (정보들을 보여준다)
        System.out.println(bookName + "," + author);
    }
}



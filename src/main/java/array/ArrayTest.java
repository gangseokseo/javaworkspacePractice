package array;

public class ArrayTest {

    public static void main(String[] args) {

        //배열 초기화
        int[] numbers = new int[3];

        //또는 int[] numbers; //numbers라는 배열 타입만 선언
        // numbers = new int[3];

        //또는 int[] numbers = {1, 2, 3}; // 먼저 타입만선언(배열변수선언) - 마지막으로 new하고 나서 배열 초기화 가능

        numbers[0] = 1; //여기서 0은 numbers 배열의 첫번째 위치를 가리킨다
        numbers[1] = 2;
        numbers[2] = 3;

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]); //1 ,2 ,3

        }

        //배열 초기화 다른방법 - 배열의 값을 처음 놓는것. [] 개수는 넣지않는다-오류가 나온다
        //int[] numbers = new int[] {0 ,1, 2}; //3개가 생성이 되고 초기화가ㅏ 되었다

        //System.out.println(numbers.length); //3, 배열의 속성 중 length - 초기화한 갯수(데이터)만큼 배열의 길이(메모리)가 잡혔다


        //초기화안하고,   10개의 studentIDs, 40byte
        int[] studentIDs = new int[5];

        for(int i = 0; i < studentIDs.length; i++){
            System.out.println(studentIDs[i]); //0으로 초기화됨
        }
    }
}

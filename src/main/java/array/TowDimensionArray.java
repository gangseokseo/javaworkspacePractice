package array;

public class TowDimensionArray {
    public static void main(String[] args) {
        //전체 모든요소를 출력하려면 이중 for 문을 사용해야 한다

        //int [][] arr = new int[2][3]; //2행 3열
        int[][] arr = {{1, 2, 3}, {4, 5, 6}}; // 같은 2행 3열

        //열의 길이 = arr[i].length
        //행의 길이 = arr.length

        System.out.println(arr.length); // 2 //여기서 length 의 길이는 행의 길이를 가리킨다.
        System.out.println(arr[0].length); // 3 // 0행 전체의 요소 // 열의 길이
        System.out.println(arr[1].length); // 3

        //전체 엘리먼트 출력, 중첩 for문 순회
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // j다  i가 아니라
                System.out.println(arr[i][j]); // 0,0 ~ 0,2

                //for 문이 다끝나면 i가 증가 . 그다음 1,0 ~ 1,2까지지

            }

        }
        char[][] alphabets = new char[13][2];
    }
}

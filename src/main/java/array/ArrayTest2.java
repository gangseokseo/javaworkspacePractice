package array;

public class ArrayTest2 {
    public static void main(String[] args) {
    //배열의 유효한 요소값 출력하기

        double[] num = new double[5];
        int size = 0; //유효한 갯수를 변수로 만든다 // 유효한값이 저장된 배열 요소 개수를 저장할 변수 선언언


       num[0] = 10.0; size++;
        num[1] = 20.0; size++;
        num[2] = 30.0; size++;

        double total = 1;
        for(int i= 0; i <size; i++) { //size대신에 nun.length가능하다
            System.out.println(num[i]);
            total *= num[i]; //계속 더하게 만든다
        }
        System.out.println("total" + total);
    }

}

package ifexample;

public class IfExample2 {

    public static void main(String[] args) {

        int age = 9;
        int charge = 0; // 비용을 0으로 초기화, 근데 초기화 안해도 상관없다. 뒤에 if문에서 값이 정해질 것이기 때문에

        if( age < 8 ){
             charge = 1000;
            System.out.println("미취학 아동입니다.");
        }
        else if(age < 14){
            charge = 2000;
            System.out.println("초등학생 입니다.");
        }
        else if(age < 20){
            charge = 2500;
            System.out.println("중,고등학생 입니다.");
        }
        else {
            charge = 3000;
            System.out.println("일반인 입니다.");
        }

        System.out.println("입장료는" + charge + "원 입니다.");

        //charge 는 정수
        //else if 는 하나라도 만족하면 나머지는 고려하지 않는다
    }

    //if- else 조건문은 조건연산자로 구현 가능하다
    /*
    if (a > b)
        max = a;
    else
        max = b;

        max = (a > b) ? a : b;

     */
}

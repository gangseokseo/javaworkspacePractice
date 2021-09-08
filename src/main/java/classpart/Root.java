package classpart;

public class Root {
    public static void main(String[] args) {

        int i;
        int j;

        //별표, 이해??
        //왼쪽 클릭후 breakpoin 확인 -f8누르면 각 라인마다 진행상황 파악가능
        for(i= 0; i < 4;  i++){
            System.out.print("["+i+"]");
            for (j=0;  j<=i ; j++){
//                System.out.print("*");
                System.out.print("["+j+"]");
            }
            System.out.println("\n");
        }
    }
}

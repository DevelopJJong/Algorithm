import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine(); // (1)을 받는다
        String B = sc.nextLine(); // (2)을 받는다
        int result0 = 0; // (3)을 저장할 곳
        int result1 = 0; // (4)을 저장할 곳
        int result2 = 0; // (5)을 저장할 곳
        int result3 = 0; // 최종 값을 저장할 곳

        int A1 = Integer.parseInt(A); // (1)을 int로 바꾼다.

        String B100 = B.substring(0,1); // (2)의 100의 자리
        int C1 = Integer.parseInt(B100); // int로 바꾼다.
        String B10 = B.substring(1,2); // (2)의 10의 자리/
        int C2 = Integer.parseInt(B10); // int로 바꾼다
        String B1 = B.substring(2); // (2)의 1의 자리
        int C3 = Integer.parseInt(B1); // int로 바꾼다.

        result0 = C3*A1;
        result1 = C2*A1*10;
        result2 = C1*A1*100;
        result3 = result0+result1+result2;
        System.out.println(result0);
        System.out.println(result1/10);
        System.out.println(result2/100);
        System.out.println(result3);


    }
}

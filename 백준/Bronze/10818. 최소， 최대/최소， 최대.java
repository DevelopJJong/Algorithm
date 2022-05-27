import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] number = new int[N];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            number[i] = sc.nextInt();
            if (number[i] >= max) {// number[i]가 max보다 클 경우에 max에 넣어서 다음 인덱스하고 비교한다.
                max = number[i]; //max = Math.max(min,number[i])
            }
            if (number[i] <= min) {// number[i]가 min보다 작은 경우에 min에 넣어서 다음 인덱스하고 비교한다.
                min = number[i]; // min = Math.min(min,number[i])
            }
        }
        System.out.println(min + " " + max);
    }
}
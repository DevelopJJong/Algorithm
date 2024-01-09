import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력문
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); // 최대한 시간을 줄이기위해 StringBuilder사용

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        int M = sc.nextInt();

        Arrays.sort(A); // 이진탐색은 정렬 후에 사용해야 하므로 선정렬

        for (int i = 0; i < M; i++) {
            if (binarySearch(A, sc.nextInt()) >= 0) {
                sb.append(1).append(" ");
            } else sb.append(0).append(" ");
        }

        System.out.println(sb);

    }

    //이진탐색 함수
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(target == arr[mid]){
                return 0;
            }
            else if(target < arr[mid]){
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return -1;
    }
}

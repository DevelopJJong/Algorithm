import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 5
        int M = sc.nextInt(); // 30
        int[] arr = new int[N]; // 2,9,14,15,16
        int sum = 0;
        int res = 0;

        for (int i = 0; i < N; i++) { // arr 입력
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k = j+1; k<N; k++){
                    sum = arr[i] + arr[j] + arr[k];

                    if( M == sum ){
                        res = sum;
                        break;
                    }

                    if(sum < M && res <= sum){ // res = 18
                        res = sum;
                    }

                }
            }
        }
        System.out.println(res);
    }
}
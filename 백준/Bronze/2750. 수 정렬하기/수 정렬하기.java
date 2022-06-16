import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int temp = 0;
        for(int k=0; k<arr.length; k++){
            arr[k] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j= 1 ; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int m=0; m<arr.length; m++){
            System.out.println(arr[m]);
        }
    }
}

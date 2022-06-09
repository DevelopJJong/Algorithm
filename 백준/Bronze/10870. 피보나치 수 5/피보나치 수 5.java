import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fibonachi(N));
    }
    public static int fibonachi(int num){
        if((num < 2) && (num >= 0)) {
            return num;
        }
        else
            return fibonachi(num-1) + fibonachi(num-2);
    }
}
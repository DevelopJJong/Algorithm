import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(factorial(N));
    }

public static int factorial(int num) {
        if(num==0){
            return 1;
        }
    return num*factorial(num-1);
    }
}
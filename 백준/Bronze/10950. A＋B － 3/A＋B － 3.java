import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i=1; i<=num; i++) {
            int num1 = scan.nextInt();
            int num2= scan.nextInt();
            int res = 0;
            res = num1 + num2;
            System.out.println(res);
        }
    }
}
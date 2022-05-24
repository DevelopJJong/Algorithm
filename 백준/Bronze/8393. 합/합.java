import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int res = 0;
        for(int i=1; i<=num; i++) {

            res = res + i;
        }
        System.out.println(res);
    }
}
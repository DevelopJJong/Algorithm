import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1; i<=9; i++) {
            int res = 0;
            res = num * i;
            System.out.printf("%d * %d = %d\n",num,i,res);
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1; i<=num; i++) {
            for(int k=num; k>i; k--){
                System.out.printf(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
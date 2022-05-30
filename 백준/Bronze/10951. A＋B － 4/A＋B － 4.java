import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNextInt()){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            sum = num1 + num2;
            System.out.println(sum);
        }
    }
}
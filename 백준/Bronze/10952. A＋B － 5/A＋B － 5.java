import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            sum = num1 + num2;
            if(num1==0 && num2 ==0){
                break;}
            System.out.println(sum);


        }

    }
}

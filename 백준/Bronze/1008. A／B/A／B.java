import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double num1,num2;
        double result=0;

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        result = num1/num2;
        System.out.println(result);

    }
}

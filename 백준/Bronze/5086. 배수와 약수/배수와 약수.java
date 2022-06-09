import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int N1 = sc.nextInt(); // 첫 번째 숫자
            int N2 = sc.nextInt(); // 두 번째 숫자
            if (N1 > N2) {
                if (N1 % N2 == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }
            }
            if (N2 > N1) {
                if (N2 % N1 == 0) {
                    System.out.println("factor");
                } else {
                    System.out.println("neither");
                }

            }
            if(N1==0 && N2 ==0){
                break;
            }
        }
    }
}
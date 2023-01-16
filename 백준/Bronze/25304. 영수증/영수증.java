import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String check = "Yes";
        int sum = sc.nextInt(); // 총 액수 입력
        int num = sc.nextInt(); // 물건 갯수
        for(int i=0; i<num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = sum - (a*b);
        }
        if(sum != 0){
            check = "No";
        }
        System.out.println(check);
    }
}
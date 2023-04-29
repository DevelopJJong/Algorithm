import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = 0;
        while(true){
            if(total % 5 == 0){
                count = count + total/5;
                System.out.println(count);
                break;
            } else if (total < 0) {
                System.out.println(-1);
                break;
            }
            total = total - 3;
            count++;
        }
    }
}

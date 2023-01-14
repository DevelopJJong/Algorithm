import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        // S는 S=(R1+R2)/2 R2를 구해라 2s - r1 = r2
        Scanner sc = new Scanner(System.in);
        int r1 = sc. nextInt();
        int s = sc. nextInt();
        int r2 = 2*s - r1;
        System.out.print(r2);

    }
}
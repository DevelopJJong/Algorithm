import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int t = sc.nextInt();// test 수(for문 돌리는 횟수)
        String[] a = new String[2];
        for(int i=0; i<t; i++){
            String s = sc.next(); // 1,2
            a = s.split(","); // a[0] = 1 , a[1] = 2 -> 두개를 더해야한다.
            System.out.println( add(Integer.parseInt(a[0]),Integer.parseInt(a[1])));
        }

    }
    public static int add(int x, int y){
        return x+y;
    }
}
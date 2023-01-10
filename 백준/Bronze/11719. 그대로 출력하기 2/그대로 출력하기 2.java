import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){ // 들어오는 게 String 이면 while문 작동
            String str = sc.nextLine(); // 입력
            System.out.println(str); // 출력
        }
    }
}

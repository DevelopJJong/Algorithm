import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for(int i=0; i<str.length(); i++) { // length길이 만큼 반복
            System.out.print(str.charAt(i)); // char로 하나하나 프린트
            if(i % 10 == 9) { // 만약 인덱스 번호가 9가 되면 줄바꿈
                System.out.println();
            }
        }

    }
}

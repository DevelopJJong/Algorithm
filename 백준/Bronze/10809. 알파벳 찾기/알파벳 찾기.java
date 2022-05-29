import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        for (char s = 'a'; s <= 'z'; s++) { // 'a'부터 'z'까지 검사한다.
            System.out.printf((S.indexOf(s)) + " ");//s의 위치를 검사하고 출력한다.
        }
    }

}
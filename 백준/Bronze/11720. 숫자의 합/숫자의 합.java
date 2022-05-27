import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N을 담는다.
        String line = sc.next(); // line을 담는다.
        char[] s = line.toCharArray(); // char로 각각 나눈다.(s[0], s[1] ...)
        int sum=0; // sum 을 선언해준다
        for(int i=0; i<N; i++){ // 한개한개를 나눠서 a에 저장하고 더한다.
            sum += Character.getNumericValue(s[i]);
        }
        System.out.println(sum);
    }
}

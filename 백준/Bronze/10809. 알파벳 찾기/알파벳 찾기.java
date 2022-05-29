import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        for (char s = 'a'; s <= 'z'; s++) {
            System.out.printf((S.indexOf(s)) + " ");
        }
    }

}
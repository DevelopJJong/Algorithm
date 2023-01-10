import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Main.add(sc.nextInt(), sc.nextInt()));
    }
    public static int add(int x, int y){
        return x+y;
    }
}
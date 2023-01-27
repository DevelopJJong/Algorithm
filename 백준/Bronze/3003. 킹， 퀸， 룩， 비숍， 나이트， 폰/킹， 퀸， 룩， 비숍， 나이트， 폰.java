import java.util.Scanner;
// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int king = sc.nextInt();
        int queen = sc.nextInt();
        int rook = sc.nextInt();
        int bishop = sc.nextInt();
        int knight = sc.nextInt();
        int pawn = sc.nextInt();
        System.out.print((1-king)+" "+(1-queen)+" "+(2-rook)+" "+(2-bishop)+" "+(2-knight)+" "+(8-pawn)); //
    }
}
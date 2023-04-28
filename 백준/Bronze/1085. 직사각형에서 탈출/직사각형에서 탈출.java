import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int dist1 = x; // 왼쪽 경계선까지의 거리
        int dist2 = y; // 아래쪽 경계선까지의 거리
        int dist3 = w - x; // 오른쪽 경계선까지의 거리
        int dist4 = h - y; // 위쪽 경계선까지의 거리

        int minDist1 = Math.min(dist1, dist3); // x축 경계선까지의 최소 거리
        int minDist2 = Math.min(dist2, dist4); // y축 경계선까지의 최소 거리

        int minDist = Math.min(minDist1, minDist2); // 두 축 중에서 최소 거리

        System.out.println(minDist); // 결과 출력
        sc.close();
    }
}
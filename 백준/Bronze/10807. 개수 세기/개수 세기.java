import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int[] num = new int[first];
        int count=0;
        for(int i=0; i<first; i++){
            num[i] = sc.nextInt();
        }
        int last = sc.nextInt();

        for(int i=0; i<first; i++){
            if(num[i] == last)
                count++;
        }
        System.out.println(count);
    }
}
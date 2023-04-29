import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coinNum = sc.nextInt();
        int total = sc.nextInt();
        int[] coinTypes = new int[coinNum];
        int count = 0;
        for(int i=0; i<coinNum; i++){
            coinTypes[i] = sc.nextInt();
        }
        for(int i=coinNum-1; i>=0; i--){
            if(total / coinTypes[i] > 0){
                count = count + total/coinTypes[i];
                total = total%coinTypes[i];
            }

        }
        System.out.println(count);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        int max = num[0];
        for(int i=0; i<num.length; i++){
            if(max <= num[i])
                max = num[i];
        }
        System.out.println(max);
        int idx = 0;
        int i = 0;
        while(true){
            if(num[i] == max){
                idx = i;
                break;
            }
            i++;
        }
        System.out.println(idx+1);
    }
}
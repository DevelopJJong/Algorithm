import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 1000 - sc.nextInt();
        int[] coinTypes = {500,100,50,10,5,1};
        int count = 0;
        for(int i=0; i<coinTypes.length; i++){
                count = count + total / coinTypes[i];
                total = total % coinTypes[i];
        }
        System.out.println(count);
    }
}
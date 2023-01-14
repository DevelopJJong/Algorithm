import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num; i>0; i--){
            for(int a=num-i; a>0; a--){
                System.out.print(' ');
            }
            for(int j=i; j>0; j--){
                System.out.print('*');
            }
            System.out.println();

//            System.out.println(); // i=5 , a=0 (한번만 작동), j=5~1, i=4, a=1(띄어쓰기 a만큼) , i=3

        }
    }
}
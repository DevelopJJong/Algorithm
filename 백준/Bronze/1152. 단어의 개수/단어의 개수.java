import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        if(A.equals(" ")){
            System.out.println(0);
            return;
        }
        String stripStr = A.strip();
        String[] B = stripStr.split(" ");
        int i=0;
         {
            while(i<B.length){
                i++;
            }
        }
        System.out.print(i);
    }
}
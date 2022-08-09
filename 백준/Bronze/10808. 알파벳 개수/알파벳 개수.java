import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alpha = {'a', 'b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'
                , 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] count = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        String A = sc.nextLine();
        char[] a = new char[A.length()];
        for(int i=0; i<A.length(); i++){
             a[i] = A.charAt(i);
        }
        for(int i=0; i<alpha.length; i++){
            for(int j=0; j<A.length(); j++) {
                if(alpha[i] == a[j]){
                    count[i]++;
                }
            }
        }
        for(int i=0; i<count.length; i++){
            System.out.print(count[i]);
            System.out.print(" ");
        }
    }
}
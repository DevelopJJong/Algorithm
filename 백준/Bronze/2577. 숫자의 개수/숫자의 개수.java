import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String ABC = Integer.toString(A*B*C);
        char[] abc = new char[ABC.length()]; // 1 2 3 4 1 2 3 4

            for(int i=0; i<ABC.length(); i++){
                abc[i] = ABC.charAt(i);
            }

            for(int i=0; i<10; i++){
                int count = 0;
                for(int j=0; j<abc.length; j++){
                    if(num[i] == abc[j]){
                        count++;
                    }
                }
                System.out.println(count);
            }
    }
}
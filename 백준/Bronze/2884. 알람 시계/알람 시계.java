import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(H<0 || H>23){
            System.out.println("시간을 잘못 입력 하셨습니다.");
        }
        if(M<0 || M>59){
            System.out.println("분을 잘못 입력 하셨습니다.");
        }
        if(M<45){
            H=H-1;
            M = (60+M) - 45;
            if(H<0){
                H=23;
            }
        }
        else {
            M = M - 45;
        }
            System.out.println(H+" "+M);
    }
}
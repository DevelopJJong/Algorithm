import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        int Num3 = sc.nextInt();
        int prize = 0;
        int max =0;
        if(Num1<=6 && Num2<=6 && Num3<=6) {
            if (Num1 == Num2 && Num2 == Num3 && Num1 == Num3) {
                prize = 10000 + (Num1 * 1000);
                System.out.println(prize);
            } else if (Num1 != Num2 && Num2 != Num3 && Num1 != Num3) {
                if (Num1 > Num2 && Num1 > Num3) {
                    prize = Num1 * 100;
                }
                if (Num2 > Num1 && Num2 > Num3) {
                    prize = Num2 * 100;
                }
                if (Num3 > Num1 && Num3 > Num2) {
                    prize = Num3 * 100;
                }
                System.out.println(prize);
            } else {
                int A = 0;
                if(Num1==Num2){
                    A=Num1;
                }
                else if(Num2==Num3){
                    A=Num2;
                }
                else{
                    A=Num3;
                }
                prize = 1000+(A*100);
                System.out.println(prize);
            }
        }

    }
}


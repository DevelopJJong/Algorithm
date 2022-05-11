import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        if(90<=test && test<=100) {
            System.out.println('A');
        }
        if(80<=test && test<90) {
            System.out.println('B');
        }
        if(70<=test && test<80) {
            System.out.println('C');
        }
        if(60<=test && test<70) {
            System.out.println('D');
        }
        if(test<60) {
            System.out.println('F');
        }

    }

}

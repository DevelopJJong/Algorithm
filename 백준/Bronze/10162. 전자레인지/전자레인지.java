import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] buttonTypes = {300, 60, 10};
        int[] count = {0, 0, 0};
        int result = 0;
        for(int i=0; i<3; i++){
            if(total%buttonTypes[2] != 0){
                result = -1;
                break;
            }
            if(total/buttonTypes[i] > 0){
                count[i] = count[i] + total/buttonTypes[i];
                total = total%buttonTypes[i];
            }

        }

        if(result != -1) {
            System.out.println(count[0] + " " + count[1] + " " + count[2]);
        }else
            System.out.println(result);
    }
}
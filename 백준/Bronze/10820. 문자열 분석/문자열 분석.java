import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) { // 들어오는 게 String 이면 while문 작동
            String m = sc.nextLine(); // 입력
            char[] ma = new char[m.length()];
            int count0 = 0;
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;

            for(int i=0; i<m.length(); i++){
                ma[i] = m.charAt(i);
            }
            for(int i=0; i<ma.length; i++) {
                if(Character.isLowerCase(ma[i])){
                    count0++;
                }else if(Character.isUpperCase(ma[i])){
                    count1++;
                }else if(Character.isDigit(ma[i])){
                    count2++;
                }else{
                    count3++;
                }
            }
            System.out.println(count0 + " " + count1 + " " + count2 + " " + count3);
        }
    }
}
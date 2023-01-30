import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int num = sc.nextInt();
        int sum = 0;
        for(int i=0; i<num; i++) {
            int a = sc.nextInt();
            if(a == 0 && stack.size() != 0)
                stack.pop();
            else
                stack.push(a);
        }
        int size = stack.size();
        if(stack.isEmpty()){
            System.out.println(0);
        }
        else {
            for (int i = 0; i < size; i++) {
                sum += stack.peek();
                stack.pop();
            }
            System.out.println(sum);
        }
    }
}
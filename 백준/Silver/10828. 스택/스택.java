import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> queue = new ArrayList<>();
        int N = Integer.parseInt(bf.readLine());
        for(int i=0; i<N; i++){
            String[] command = bf.readLine().split(" ");
            if ("push".equals(command[0])) {
                queue.add(Integer.parseInt(command[1]));
            }
            if ("top".equals(command[0])){
                if(queue.size()==0){
                    System.out.println(-1);
                }else {
                    System.out.println(queue.get(queue.size() - 1));
                }
            }
            if ("size".equals(command[0])){
                System.out.println(queue.size());
            }
            if ("empty".equals(command[0])){
                if(queue.size()==0){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            if("pop".equals(command[0])){
                if(queue.size()==0){
                    System.out.println(-1);
                }
                else {
                    int A = queue.get(queue.size()-1);
                    queue.remove(queue.size()-1);
                    System.out.println(A);
                }
            }
        }
    }
}
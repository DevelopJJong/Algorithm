import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> queue = new ArrayList<>();
        String[] command = new String[2];

        for(int i=0; i<N; i++){
            String command0 = br.readLine();
            command = command0.split(" ");

            switch (command[0]){
                case "push": //push 2
                    int num = Integer.parseInt(command[1]);
                    queue.add(num);
                    continue;

                case "pop":
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(queue.get(0));
                        queue.remove(0);
                    }
                    continue;

                case "size":
                    System.out.println(queue.size());
                    continue;

                case "empty":
                    if(queue.isEmpty()){
                        System.out.println(1);
                    }else System.out.println(0);
                    continue;

                case "front":
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    }else System.out.println(queue.get(0));
                    continue;

                case "back":
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    }else System.out.println(queue.get(queue.size()-1));
                    continue;
            }
        }

    }
}

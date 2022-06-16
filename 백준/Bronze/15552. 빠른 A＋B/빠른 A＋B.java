import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        int sum = 0;
        for(int i=0; i<N; i++){
            String num = bf.readLine();
            String[] snumber = num.split(" ");
            sum = Integer.parseInt(snumber[0]) + Integer.parseInt(snumber[1]) ;
            bw.write(Integer.toString(sum));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String a = Long.toString(n);
        String[] b = new String[a.length()];
        
        for(int i=0; i<a.length(); i++){
            b[i] =  Character.toString(a.charAt(i));
        }
        Arrays.sort(b, Collections.reverseOrder());
        a="";
        for(int i=0; i<b.length; i++){
            a += b[i];
        }
        return Long.parseLong(a);
    }
}
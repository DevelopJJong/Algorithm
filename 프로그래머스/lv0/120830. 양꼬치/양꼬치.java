class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer = 12000*n + 2000*k;
        if(n>=10){
            k = k - (int)Math.floor(n/10);
            return 12000*n + 2000*k;
        }else return answer;
    }
}
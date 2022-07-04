class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] engNum = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0; i<engNum.length; i++){
        s = s.replaceAll(engNum[i],Integer.toString(i));
    }
        answer = Integer.parseInt(s);
        return answer;
    }
}
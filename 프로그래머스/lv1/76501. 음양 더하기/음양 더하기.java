class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        String[] signs0 = new String[signs.length];
        String[] num = new String[absolutes.length];
        for(int i=0; i<signs.length; i++) {
            if(signs[i] == true){
                signs0[i] = "+";
            }
            else {
                signs0[i] = "-";
            }
        }
        for(int i=0; i< absolutes.length; i++){
            num[i] = signs0[i].concat(Integer.toString(absolutes[i]));
            answer += Integer.parseInt(num[i]);
        }
        return answer;
    }
}
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = Integer.toString(x);
        char[] s_char = new char[s.length()];
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            s_char[i] = s.charAt(i);
            sum += Character.getNumericValue(s_char[i]);
        }
        if(x%sum != 0) return answer = false;
        else return answer;
    }
}
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int count_even = 0;
        int count_odd = 0;
        for(int i=1; i<=num_list.length; i++){
            if(num_list[i-1]%2 ==0){
                count_even++;
            } else count_odd++;
        }
        return new int[]{count_even,count_odd};
    }
}
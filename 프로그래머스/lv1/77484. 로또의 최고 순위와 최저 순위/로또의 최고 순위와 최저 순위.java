import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        
        ArrayList<Integer> lottos_pick = new ArrayList<>();
        
        for(int i=0; i<lottos.length; i++) {
            lottos_pick.add(lottos[i]);
            if(lottos[i] == 0) count++;
        }
        
        ArrayList<Integer> win_nums_pick = new ArrayList<>();
        
        for(int i=0; i<win_nums.length; i++) {
            win_nums_pick.add(win_nums[i]);
        }
        
        HashSet<Integer> result = new HashSet<>(lottos_pick);
        result.retainAll(win_nums_pick);
        
        answer[0] = rank(result.size()+count);
        answer[1] = rank(result.size());
        
        
        return answer;
    }
    public int rank(int n){
        switch(n){
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
}
}
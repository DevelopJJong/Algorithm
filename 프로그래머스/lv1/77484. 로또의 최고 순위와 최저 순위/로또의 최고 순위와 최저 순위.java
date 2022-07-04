import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int Max = 0;
        int Min = 0;
        
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
        
        Max = result.size()+count;
        Min = result.size();
        if(Max>6){
            Max = 6;
        }
        switch(Max){
            case 6: answer[0] = 1; break;
            case 5: answer[0] = 2; break;
            case 4: answer[0] = 3; break;
            case 3: answer[0] = 4; break;
            case 2: answer[0] = 5; break;
            default: answer[0] = 6; break;
        }
        switch(Min){
            case 6: answer[1] = 1; break;
            case 5: answer[1] = 2; break;
            case 4: answer[1] = 3; break;
            case 3: answer[1] = 4; break;
            case 2: answer[1] = 5; break;
            default: answer[1] = 6; break;
        }
        return answer;
    }
}
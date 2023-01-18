class Solution {
    public long solution(long num) {
        int count = 0;
        while(count<500){
        if(num%2 == 0){
            num = num/2;
        }
        else if(num == 1){
            break;   
        }else{
            num = (num*3)+1;       
        }
            count++;
        
        }
    if(count == 500)
            return -1;
    else
        return count;
    }
}
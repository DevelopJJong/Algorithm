class Solution {
    public long solution(int price, int money, int count) {
        // price = 3 , money = 20, count = 4, result = 10 20 - 3+6+9+12 = -10
        // money - 
        long a = 0;
        for(int i=1; i<=count; i++){
            a += price*i;
        }
        long answer = Math.abs(money-a);
        System.out.println(a);
        if(money>a) return 0;
        return answer;
    }
}
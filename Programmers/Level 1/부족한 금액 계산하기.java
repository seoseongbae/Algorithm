class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum=0;
        for(int i=1;i<=count;i++)
        {
            sum+=price*i;    
        }
        if(sum>money)
        {
            answer=sum-money;    
        }else
        {
            answer=0;    
        }
        return answer;
    }
}
---------
다시 푼 코드
    class Solution {
    public long solution(int price, long money, int count) {
        long answer = 0;
        for(long i=1;i<=count;i++)
        {
            answer+=i*price;
        }
        if(answer>money){
             answer=answer-money;
        }else{
            answer=0;
        }
       
        
        return answer;
    }
}

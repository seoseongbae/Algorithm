class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum=x;
        int y=0;
        while(sum>0)
        {
            y+=sum%10;
            sum/=10;
        }
        if(x%y==0)
        {
            return answer;
        }
        else{
            answer=false;
            return answer;
        }
    }
}

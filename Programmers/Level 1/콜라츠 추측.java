class Solution {
    public int solution(int num) {
        int answer = 0;
        double num2;
        num2=num;
        if(num2==1)
        {
            return 0;
        }
        while(num2!=1)
        {
            if(num2%2==0)
            {
                num2=num2/2;
                answer++;
            }
            else if(num2%2==1)
            {
                num2=(num2*3)+1;
                answer++;
            }
            if(answer==500)
            {  
                answer=-1;
                break;
            }
        }
        return answer;
    }
}

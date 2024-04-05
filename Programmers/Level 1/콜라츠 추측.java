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
-----------------------------------------------------------------------------------------
다시 푼 소스
    class Solution {
    public int solution(long num) {
        int answer = 0;
        while(num>1){
            if(num%2==1){
                num=num*3+1;
                    answer++;
            }
            else if(num%2==0){
                num=num/2;
                answer++;
                
            }
            if(answer==500){
                answer=-1;
                break;
            }
        }
        return answer;
    }
}

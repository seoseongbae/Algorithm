class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<absolutes.length;i++)
        {
            if(signs[i]==false)
            {
                absolutes[i]=absolutes[i]*-1;   
            }
            else{
                absolutes[i]=Math.abs(absolutes[i]);
            }
        }
        for(int i=0;i<absolutes.length;i++)
        {
            answer+=absolutes[i];    
        }
        return answer;
    }
}
----------------------------------------------------------------------------
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<absolutes.length;i++)
        {
            if(signs[i]==true)//불리언 배열에 있는 값이 참이면
            {
                answer+=absolutes[i];
            }
            else{//거짓이면
                answer+=-absolutes[i];
            }
        }
        return answer;
    }
}

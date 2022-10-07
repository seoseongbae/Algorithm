class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str=s.split("");
        int count=0;
        if(str.length%2==0)
        {
            count=str.length/2;
            for(int i=count-1;i<=count;i++)
            {
                answer+=str[i];
            }
        }
        else if(str.length%2!=0)
        {
            count=str.length/2;
            answer+=str[count];
        }
        return answer;
    
    }
}

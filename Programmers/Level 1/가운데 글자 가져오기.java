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
--------------------------------------------------------
다시 푼 코드 charAt()를 사용하여 해결
class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==0)
        {
            answer+=s.charAt(s.length()/2-1)+""+s.charAt(s.length()/2);    
        }else{
            answer+=s.charAt(s.length()/2);
        }
        return answer;
    }
}

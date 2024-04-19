class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4||s.length()==6)
        {  
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)<'0'||s.charAt(i)>'9') 
                {
                    return false;
                } 
            }
        }
        else{
            return false;
        }
        return answer;
    }
}
---------------------------------------------------
다시 푼 코드
    class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int count=0;
        if(s.length()==4||s.length()==6){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) < 48 || s.charAt(i) > 57)
                {
                    count++;
                }
            }
            if(count!=0) answer=false; 
        }else{
            answer=false;
        }
       
        return answer;
    }
}

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
--------------------------------------------------------
다시 푼 문제 - int형을 string 형으로 반환 후 문자로 하나씩 받아 계산.
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum=0;
		String str=String.valueOf(x);
		for(int i=0;i<str.length();i++) {
			sum+=str.charAt(i)-48;
		}
		if(x%sum==0) answer=true;
        else answer=false;
        return answer;
    }
}

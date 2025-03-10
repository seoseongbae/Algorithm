import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
       ArrayList<Integer> list=new ArrayList<Integer>();
        while(n!=0)
        {
            list.add(n%3);
            n/=3;
        }
        int count=1;
        for(int i=list.size()-1;i>=0;i--)
        {
            answer+=list.get(i)*count;
            count*=3;
        }
        return answer;
    }
}
--------------------------
새로운 코드 -
class Solution {
    public int solution(int n) {
        int answer = 0;
       int count=n;
		String str="";
		while(true) {
			str+=String.valueOf(n%3);
			n=n/3;
			if(n/3<1) {
				str+=n;
				System.out.println(str);
				break;
			}
		}
		for(int i=0;i<str.length();i++)
		{
			if(count/3<3) {
				answer+=Math.pow(3, i)*(str.charAt(i)-48);				
			}
			else {
				answer+=Math.pow(3, i)*(str.charAt(str.length()-i-1)-48);
			}
		}
        return answer;
    }
}

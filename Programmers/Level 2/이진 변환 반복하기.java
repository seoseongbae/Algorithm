import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer=new int[2];
        int count=0,zero=0;
        while(!s.equals("1"))
        {
            int length=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='1')
                {
                    length++;
                }else{
                    zero++;
                }
            }
            s=Integer.toBinaryString(length);
            count++;
        }
        answer[0]=count;
        answer[1]=zero;
        return answer;
    }
}

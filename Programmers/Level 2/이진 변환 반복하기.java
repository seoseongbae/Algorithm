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
----------------------------------------------------
//다시 푼 문제
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count=0; //몇번 돌아갔는지 확인하는 함수
		int delzero=0; //0이 몇개 제거되었는지 확인하는 함수
		int slen = 0;//길이 담는 변수
		while(true) {
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='0') {
					delzero++;
				}
			}
			s = s.replaceAll("0", "");
			slen = s.length();
			count++;
			s = Integer.toBinaryString(slen);
			if(s.equals("1")) {
				break;
			}
		}
		answer[0]=count;
		answer[1]=delzero;
        return answer;
    }
}

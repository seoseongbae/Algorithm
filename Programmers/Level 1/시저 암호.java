import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ') { 
				answer += ch;
				continue;
			}
            if(ch>='a' && ch<='z') {
				if(ch+n > 'z') {
					answer += (char)(ch-26+n);
				}else {
					answer += (char)(ch+n);
				}
			}else if(ch>='A' && ch<='Z') { 
				if(ch+n > 'Z') {
					answer += (char)(ch-26+n);
				}else {
					answer += (char)(ch+n);
				}
			}
        }
        return answer;
    }
}
------------------------------------------------------------------------------------

	class Solution {
    public String solution(String s, int n) {
       String answer="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				answer+=' ';
			}else {
				if (s.charAt(i) != 'Z' && s.charAt(i) != 'z') { //문자가 Z,z가 아닐경우
					if(s.charAt(i)<'Z'&& s.charAt(i)+n>'Z'||s.charAt(i)+n>'z') {//마지막 값 넘길경우
						answer+=(char)(s.charAt(i)+n-26); //초기 a,A로 바꿔서 추가로 넘겨줌
					}else {
						answer += (char) (s.charAt(i) + n); //아닐경우 그냥 +n만큼 해줌
					}
				}else {
					if (s.charAt(i)=='Z') { //Z일경우 
						answer += (char)('A'+n-1); //A로 넘어가야함으로 A로변환한후+n만큼옮기고-1
					} else if (s.charAt(i)=='z') {
						answer += (char)('a'+n-1);
					}
				}
			}
		}
        return answer;
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str=s.split("");
        int idx=0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals(" "))
            {
                idx=0;
                answer+=" ";
            }
            else if(idx%2==0){
                answer+=str[i].toUpperCase();
                idx++;
                
            } 
            else if(idx%2!=0){
               answer+=str[i].toLowerCase();
                idx++;
            }
        }
        
        return answer;
    }
}
----------------------------------------------------------------------
다시푼 코드 -- split을 써서 하나씩 string배열에 넣어 반복하면서 count로 단어 끝나는지 체크하며 홀수일경우 소문자 짝수일경우 대문자로 변환
class Solution {
    public String solution(String s) {
        String answer = "";
		String[] str = s.split("");
		int count=0;
		for(int i=0;i<str.length;i++) {
			if(str[i].equals(" ")) {//배열[i]값이 공백일경우
				count=1; //1로 초기화
			}
			if(count%2==0) {
				answer+=str[i].toUpperCase();
				count++;
			}else {
				answer+=str[i].toLowerCase();
				count++;
			}
		}
        return answer;
    }
}

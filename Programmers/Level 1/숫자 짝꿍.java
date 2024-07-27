import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder(); // 시간초과 해결을 위한 StringBuilder
		char[] x = X.toCharArray();
        char[] y = Y.toCharArray();
		int[] xCheckCnt = new int[10];
        int[] yCheckCnt = new int[10];
        
        for(int i = 0; i < x.length; i++) { //x문자열에 숫자  갯수 세기
            int tmp = x[i] - '0';
            xCheckCnt[tmp]++;
        }
        for(int i = 0; i < y.length; i++) {//y문자열에 숫자 갯수 세기
            int tmp = y[i] - '0';
            yCheckCnt[tmp]++;
        }
        List list = new ArrayList();
        for(int i=9;i>=0;i--) {
        	int cnt = Math.min(xCheckCnt[i], yCheckCnt[i]); //최소값 찾아서 StringBuilder에 대입.
            for(int t = 0; t < cnt; t++) {
                sb.append(i);
            }
        }
        answer = sb.toString();
        if(answer.length()==0) { //길이가 0일경우 -1반환
        	answer="-1";
        }else {
        	if(answer.charAt(0)=='0') { //첫글자가 0이라면 0으로 반환
        		answer="0";
        	}
        }
        return answer;
    }
}

//repeat() 함수 문자열을 반복해주는 함수.

import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str= {"aya","ye","woo","ma"};
		for(int i=0;i<babbling.length;i++) {
			for(int j=0;j<str.length;j++) {
				if(!babbling[i].contains(str[j].repeat(2))){ str[j]에 들어있는 문자열을 2번 반복한값이 존재하지 않을경우
                    babbling[i] = babbling[i].replace(str[j]," "); //문자들을 공백으로 변경
                }else{
                    break;
                }
				
			}
		}
		for(int i=0;i<babbling.length;i++) {
			if(babbling[i].trim().isEmpty()){
				answer++;
			}
		}
        return answer;
    }
}

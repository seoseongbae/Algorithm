import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i=0;i<completion.length;i++)
        {
            if(!participant[i].equals(completion[i]))
            {
                return participant[i]; 
            }
        }
        return participant[i]; 
    }
        
}
--------------------------------------------------------------------------------------------------
다시 푼 코드
import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant); //주어진 배열을 정렬
		Arrays.sort(completion);
		int i=0;
		for( i=0;i<completion.length;i++) { 
			if(!participant[i].equals(completion[i])) { //참가 선수와 완주한 선수 이름이 같지 않을 경우
				answer=participant[i];
				break;
			}
		}
		answer=participant[i];  //정렬 한 값중 마지막 값이 완주를 못한 선수일 경우.
        return answer;
    }
}

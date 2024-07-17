import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer=0;
		Arrays.sort(score);
		if(score.length%m==0) { //나머지가 0인 경우
			for(int i=0;i<score.length;i+=m) { // m개씩 나눠 최소값 계산
				for(int j=i;j<i+m;j++) {
					answer += score[j]*m*1;
					break;
				}
			}			
		}else {
			for(int i=score.length-(m*(score.length/m));i<score.length;i+=m) { score길이부터 m*score/m을 뺀 값부터 score길이까지 최소값 계산
				for(int j=i;j<i+m;j++) {
					answer += score[j]*m*1;
					break;
				}
			}
		}
        return answer;
    }
}

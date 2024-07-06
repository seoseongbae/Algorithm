import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int sort[] = new int[rank.length];

		for (int i = 0; i < rank.length; i++) { 
			if (attendance[i]) { //true이면
				sort[i] = rank[i]; sort배열에 추가
			} else {
				rank[i] = Integer.MAX_VALUE; //아니면 int형 최대값으로 변환
			}
		}

		Arrays.sort(rank);

		for (int i = 0; i < sort.length; i++) {
			if (rank[0] == sort[i]) {
				answer += i * 10000;
			} else if (rank[1] == sort[i]) {
				answer += i * 100;
			} else if (rank[2] == sort[i]) {
				answer += i;
			}
		}
        return answer;
    }
}

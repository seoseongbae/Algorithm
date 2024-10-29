import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int answer = citations.length; //전체 갯수확인
        Arrays.sort(citations);
        for (int i : citations) { 
			if(i>=answer) { //전체 갯수와 정렬된 citations배열값을 비교
				break;
			}else {
				answer--;
			}
		}
        return answer;
    }
}

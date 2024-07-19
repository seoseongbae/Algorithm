class Solution {
    public int solution(int n, int m, int[] section) {
        int answer=1;
		
		int roll = section[0];
		for(int i=1;i<section.length;i++) { //section 0번째 값은 이미 roll 로지정하였기 때문 1부터 시작
			if(roll+m-1<section[i]) { roll+m-1값보다 큰경우 answer증가 후 roll을 변환
				answer++;
				roll=section[i];
			}
		}
        
        return answer;
    }
}

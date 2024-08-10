class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
		int attackIdx=0; //공격 인덱스
		int heal=0; //회복 카운트
		for (int i = 1; i <= attacks[attacks.length-1][0]; i++) {
				if (i != attacks[attackIdx][0]) { //공격안받을 경우
					answer += bandage[1];
					heal++;
					if(heal==bandage[0]) {
						answer+=bandage[2];
						heal=0;
					}
					if(answer>health) answer=health; //체력이 기준 체력보다 높을 경우
				}else { //공격을 받았을 경우
					heal=0;
					answer-=attacks[attackIdx][1];
					attackIdx++;
				}
				
				if(answer<=0) {
					answer = -1;
					break;
				}
		}
        return answer;
    }
}

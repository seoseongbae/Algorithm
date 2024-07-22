class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer= new int[2];
		
		for(int i=0;i<lottos.length;i++) { //최저 순위 번호
			for(int j=0;j<win_nums.length;j++) {
				if(lottos[i]==win_nums[j]) {
					answer[1]++;
				}
			}
		}
		for(int i=0;i<lottos.length;i++) { //최고 순위 번호
			for(int j=0;j<win_nums.length;j++) {
				if(lottos[i]==0) {
					answer[0]++;
					lottos[i]=-1;
				}
				if(lottos[i]==win_nums[j]) {
					answer[0]++;
				}
			}
		}
		for(int i=0;i<answer.length;i++) { //등수 확인
			if(answer[i]==1||answer[i]==0) {
				answer[i]=6;
			}else if(answer[i]==2) {
				answer[i]=5;
			}else if(answer[i]==3) {
				answer[i]=4;
			}else if(answer[i]==4) {
				answer[i]=3;
			}else if(answer[i]==5) {
				answer[i]=2;
			}else if(answer[i]==6) {
				answer[i]=1;
			}
		}
        return answer;
    }
}

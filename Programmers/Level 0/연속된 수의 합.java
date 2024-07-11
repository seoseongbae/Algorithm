class Solution {
    public int[] solution(int num, int total) {
        int[] answer= new int[num];
		int first=0;
		int num1=total/num; // 중간값 찾기
		if(num%2==0) { //짝수일땐 중간값에서 num/2한값을 뺀 후 +1
			first=num1-num/2+1;
		}else { //홀수일땐 중간값에서 num/2한값을 뺌
			first=num1-num/2;
		}
		for(int i=0;i<num;i++) {
			answer[i]=first++;
		}
        return answer;
    }
}

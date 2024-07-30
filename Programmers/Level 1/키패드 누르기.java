class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left=10,right=12;
		
		for(int i=0;i<numbers.length;i++) {
			int n =numbers[i];
			if(numbers[i]==1||numbers[i]==4||numbers[i]==7) { //numbers[i]값이 1,4,7일경우 answer에 L을 추가하고 left값을 변경
				answer+="L";
				left=n;
			}else if(numbers[i]==3||numbers[i]==6||numbers[i]==9) { //numbers[i]값이 3,6,9일경우 answer에 R을 추가하고 right값을 변경
				answer+="R";
				right=n;
			}else { //numbers[i] 값이 2,5,8,0 일경우
				if(n==0) n=11; //numbers[i]값이 0일경우
				 
				int le = Math.abs(n-left)/3 + Math.abs(n-left)%3; //왼쪽 손가락 거리 구하기
				int ri = Math.abs(n-right)/3 + Math.abs(n-right)%3; //오른쪽 손가락 거리 구하기
				
				if(le<ri) { //왼쪽 손가락 거리가 짧을 경우 answer에 대입후 left값 변경 
					answer+="L";
					left=n;
				}else if(le>ri) { //오른쪽 손가락 거리가 짧을 경우 answer에 대입후 right값 변경 
					answer+="R";
					right=n;
				}else { // 왼쪽 과 오른쪽 거리가 같을 경우
					if(hand.equals("left")) {  //hand가 left인 경우
						answer+="L";
						left=n;
					}else if(hand.equals("right")){ //hand가 right인 경우
						answer+="R";
						right=n;
					}
				}
			}
		}
        return answer;
    }
}

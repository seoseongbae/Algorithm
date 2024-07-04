class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int start=-1;
		int end=-1;
		for(int i =0;i<arr.length;i++) { //처음 2값 찾기
			if(arr[i]==2) {
				start=i;
				break;
			}
		}
		for(int i=arr.length-1;i>=0;i--) { //마지막 2값 찾기
			if(arr[i]==2) {
				end=i;
				break;
			}
		}
		if(start!=-1&&end!=-1) { //start와 end값이 초기값이 아닌경우
			answer= new int[end-start+1];
			int count=0;
			for(int i=start;i<=end;i++) {
				answer[count++]=arr[i];
			}
		}else { //start와 end값이 초기값일 경우 answer에 -1 대입
			answer=new int[1];
			answer[0]=-1;
		}
		
        return answer;
    }
}

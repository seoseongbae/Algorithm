class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i=0;i<queries.length;i++) {
			int s=queries[i][0];
			int e=queries[i][1];
			int k=queries[i][2];
			
			int min=Integer.MAX_VALUE;
			for(int j=s;j<=e;j++) {
				if(arr[j]>k) { // k보다 클경우
					if(min>arr[j]) { //min보다 arr[j]값이 작을경우
						min=arr[j]; //값 대입
						answer[i]=min; //answer배열에 값 대입
					}
					
				}
			}
			if(answer[i]<=k) { //answer배열에 값이 k값보다 작을경우 -1로 변경
				answer[i]=-1;
			}
		}
        return answer;
    }
}

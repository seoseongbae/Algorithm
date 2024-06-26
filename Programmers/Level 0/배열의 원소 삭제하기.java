class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        for(int i=0;i<arr.length;i++) {
			for(int j=0;j<delete_list.length;j++) {
				if(arr[i]==delete_list[j]) {
					arr[i]=0;
				}
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				count++;
			}
		}
		int[]answer= new int[count];
		count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				answer[count++]=arr[i];
			}
		}
        return answer;
    }
}

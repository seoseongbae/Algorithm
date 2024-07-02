class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < queries.length; i++) {
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				if (j % queries[i][2] == 0) { //j가 queries[i][2]값의 배수이면 1을 추가
					arr[j] = arr[j] + 1;
				} else {
					arr[j] = arr[j];
				}
			}
		}
        answer=arr.clone();
        return answer;
    }
}

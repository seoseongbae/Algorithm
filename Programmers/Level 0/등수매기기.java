--나눈값을 실수형 배열에 넣어 순위를 구함.

class Solution {
    public int[] solution(int[][] score) {
        double[] arr = new double[score.length];
		int[] answer = new int[arr.length];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				arr[i] += score[i][j];
			}
				arr[i]=arr[i]/score[i].length;
			answer[i]=1;
			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) {
					answer[j]+=1;
				}
			}
		}
        return answer;
    }
}

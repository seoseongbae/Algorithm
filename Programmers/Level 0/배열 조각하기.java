import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        List list = new ArrayList();
        int count=0;
		for(int i=0; i<query.length; i++){ //query배열 안에 있는 값을 구하기 위해 for문 선언
			if(i%2==0) { //짝수인 경우
				for(int j=query[i]+1;j<arr.length;j++) { 카피할 배열의 길이를 구하기 위해 count 구함.
					count++;
				}
				int[] temp = new int[arr.length-count];
				System.arraycopy(arr, 0, temp, 0, arr.length-count); //arr 0부터 temp배열에 arr.length-count값만큼 복사
				arr = temp;
			}else {
				for(int j=query[i]-1;j>=0;j--) {
					count++;
				}
				int[] temp = new int[arr.length-count];
				System.arraycopy(arr, query[i], temp, 0, arr.length-count); //arr의 query[i]값부터 temp배열에 arr.length-count값만큼 복사
				arr = temp;
				
			}
			count=0;
		}
		answer= new int[arr.length];
        answer=arr.clone();
        return answer;
    }
}

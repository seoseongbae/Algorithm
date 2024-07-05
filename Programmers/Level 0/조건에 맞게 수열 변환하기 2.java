import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int[] arr2= Arrays.copyOf(arr, arr.length); //arr2에 초기값 복사.
		int answer = 0;
		while (true) {

			for (int i = 0; i < arr.length; i++) { //arr배열에 길이만큼 돌리며
				if (arr[i] % 2 == 0 && arr[i] >= 50) { //짝수이면서 50보다 클때
					arr[i] = arr[i] / 2;
				} else if (arr[i] < 50 && arr[i] % 2 != 0) { //홀수이면서 50보다 작을때
					arr[i] = (arr[i] * 2) + 1;
				}
			}

			if(Arrays.equals(arr,arr2)) { //배열 arr과 arr2가 같으면 break;
				break;
			}
			
			arr2=Arrays.copyOf(arr,arr.length); //arr2에 arr값을 복사
			answer++;
		}
        return answer;
    }
}

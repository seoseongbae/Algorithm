import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        Set set =new HashSet();
		int[] answer= new int[k];
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(!set.contains(arr[i])) { //set에 arr[i]값이 존재하지 않는다면
				set.add(arr[i]); //set에 대입(다음 값을 비교하기위해)
				answer[count++]=arr[i]; //answer배열에 arr[i] 대입
			}
			if(count==k){
				break;
			}
		}
		while(count<k) { //count가 k보다 작을경우
			answer[count++]=-1; count가 k랑 같아질때까지 -1를 대입
		}
        return answer;
    }
}

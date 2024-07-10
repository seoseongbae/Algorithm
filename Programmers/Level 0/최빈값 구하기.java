//오류난 이유 = array의 원소의 길이가 0부터 1000까지인데 1부터 판단하여 set으로 값을 가져와 배열은 0부터 시작하므로
//   -1을 하여 런타임 에러가 발생했다.
import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer=0;
		Set set =new HashSet();
		for(int i=0;i<array.length;i++) {
			set.add(array[i]);			
		}
		int[] arr= new int[set.size()];
		for(int i=0;i<array.length;i++) {
			arr[array[i]-1]++;
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				count++;
				answer=i+1;
			}
		}
		if(count>1) {
			answer=-1;
		}
        return answer;
    }
}
----------------------------------------------------------------------
import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer=0;
		int[] arr= new int[1000]; //array의 원소의 길이가 0부터 1000까지 임으로 길이를 1000으로 생성
		for(int i=0;i<array.length;i++) { //array방 안에 있는 값 번째에 1씩 추가해줌
			arr[array[i]]++;
		}
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) { //최대값 구하기
				max=arr[i];
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) { //max값이랑 arr배열에 있는 값이랑 같으면
				count++; //같은 값이 여러개인지 확인하는 count변수를 1추가
				answer=i; //그 answer 값을 i에 추가
			}
		}
		if(count>1) { //count값이 1개 이상이면 같은값이 여러개이기 때문에 answer에 -1을 대입.
			answer=-1;
		}
        return answer;
    }
}

n값에 가까운 값부터 우선 출력하는 프로그램이다.

생각해야할 것은 n과 가까운 거리가 같은경우 큰값을 나오게 해야함.

import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double []arr=new double[numlist.length];
		 for(int i=0;i<numlist.length;i++){
			 if(numlist[i]-n<0) //n값을 뻈을때 음수일경우 0.5를 더하여 후순위로 밀리게 함.
			 {
				 arr[i]=Math.abs(numlist[i]-n)+0.5;
			 }else {
				 arr[i]=numlist[i]-n;
			 }
	        }
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]%1!=0) {//나머지값이 0이 아니면 n에서 arr[i]값을 뺴줌
				 answer[i]=n-(int)arr[i];
			 }else { //0이면 arr[i]에 n값을 더해줌
				 answer[i]=(int)arr[i]+n;
			 }
		 }

            return answer;
    }
}

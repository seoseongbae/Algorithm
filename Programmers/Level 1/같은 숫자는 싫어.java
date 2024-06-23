import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList <Integer> arrlist = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(i==0||arr[i-1]!=arr[i]){
                arrlist.add(arr[i]);
            }
        }
        int[] answer = new int[arrlist.size()];
                 for (int j = 0; j < arrlist.size(); j++){
             answer[j] = arrlist.get(j);

        }
        return answer;
    }
}

-------------------------------------------------------------------------
다시 푼 문제
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
		List list = new ArrayList();
		
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				list.add(arr[i]);
			}else {
				if(arr[i-1]!=arr[i]) {
					list.add(arr[i]);
				}
			}
		}
		int answer[]=new int[list.size()];
		for(int i=0;i<answer.length;i++) {
			answer[i]=(int) list.get(i);
		}
        

        return answer;
    }
} 

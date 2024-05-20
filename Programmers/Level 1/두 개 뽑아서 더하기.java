import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list=new ArrayList<Integer>();
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-1;i++)
        {
            for(int j=i+1;j<numbers.length;j++)   
            {
                if(!list.contains(numbers[i]+numbers[j]))
                {
                    list.add(numbers[i]+numbers[j]);
                }
                    
            }
        }
        answer=new int[list.size()];
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            answer[i]=list.get(i);    
        }
        return answer;
    }
}
----------------------------------------------------------------------
//set을 이용하여 코드 해결.
import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
       Set set =new HashSet();
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				set.add(numbers[i]+numbers[j]);
			}
		}
		int[] answer=new int[set.size()];
		Iterator iter = set.iterator();
		int count=0;
		while(iter.hasNext()) {
			answer[count++]=(int) iter.next();
		}
		Arrays.sort(answer);
        return answer;
    }
}

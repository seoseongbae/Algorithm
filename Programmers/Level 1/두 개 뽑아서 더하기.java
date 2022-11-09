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

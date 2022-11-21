import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] num1={1,2,3,4,5};
        int[] num2={2,1,2,3,2,4,2,5};
        int[] num3={3,3,1,1,2,2,4,4,5,5};
        int[] count=new int[3];
        
        for(int i =0; i<answers.length; i++){
            if(num1[i%num1.length] == answers[i]) count[0]++;
            if(num2[i%num2.length] == answers[i]) count[1]++;
            if(num3[i%num3.length] == answers[i]) count[2]++;
        }
        
        int max = Math.max(count[0],Math.max(count[1],count[2]));
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max==count[0]) list.add(1);
        if(max==count[1]) list.add(2);
        if(max==count[2]) list.add(3);
        
        answer = new int[list.size()];
        
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}

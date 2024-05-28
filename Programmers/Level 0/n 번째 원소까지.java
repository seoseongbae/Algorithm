import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List list =new ArrayList();
        for(int i=0;i<num_list.length;i++){
            if(list.size()<n){
                list.add(num_list[i]);    
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=(int)list.get(i);
        }
        return answer;
    }
}

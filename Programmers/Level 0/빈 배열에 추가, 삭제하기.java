import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List list =new ArrayList();
        for(int i =0;i<flag.length;i++){
            if(flag[i]){
                for(int j=0;j<arr[i]*2;j++){
                    list.add(arr[i]);
                }
            }else{
                for(int j=0;j<arr[i];j++){
                    list.remove(list.size()-1);
                }
            }
        }
        answer = new int[list.size()];
        for(int i=0;i<answer.length;i++) {
        	answer[i]=(int)list.get(i);
        }
        return answer;
    }
}

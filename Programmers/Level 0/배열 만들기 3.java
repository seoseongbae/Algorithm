import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List list = new ArrayList();
        for(int i=0;i<intervals.length;i++){
            for(int j=intervals[i][0];j<=intervals[i][1];j++){
                list.add(arr[j]);
            }
        }
        answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=(int)list.get(i);
        }
        return answer;
    }
}

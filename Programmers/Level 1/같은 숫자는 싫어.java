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

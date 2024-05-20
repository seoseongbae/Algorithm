//list에 필요한 데이터를 추가후 정렬하여 원하는 값 추출한다.
import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List list=new ArrayList();
		int[] answer = new int [commands.length];
        int count=0;
        for(int i=0;i<commands.length;i++){
            for(int j=commands[i][0]-1;j<=commands[i][1]-1;j++){
              list.add(array[j]);
            }
            Collections.sort(list);
            answer[count++]=(int) list.get(commands[i][2]-1);
            list.clear();
        }
        
        return answer;
    }
}

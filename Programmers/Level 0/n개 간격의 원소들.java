몇개의 원소가 나올지 모르니 list를 선언하여 값을 추가해주고,
그 list에 있는 값을 배열로 다시 넣었다.
import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List list =new ArrayList();
        for(int i=0;i<num_list.length;i+=n){
            list.add(num_list[i]);
        }
        int [] answer= new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=(int)list.get(i);
        }
        return answer;
    }
}

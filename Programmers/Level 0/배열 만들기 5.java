import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List list = new ArrayList();
        int ret = 0;
        for(int i =0;i<intStrs.length;i++){
            ret = Integer.parseInt(intStrs[i].substring(s,s+l)); //substring으로 변환후 정수형으로 형 변환
            if(ret>k){
                list.add(ret);
            }
        }
        answer = new int[list.size()];
        for(int i =0;i<answer.length;i++) {
        	answer[i]=(int)list.get(i);
        }
        return answer;
    }
}

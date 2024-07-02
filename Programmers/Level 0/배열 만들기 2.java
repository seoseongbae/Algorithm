import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer= {};
		List list =new ArrayList();
        for(int i=l;i<=r;i++){
            String s =String.valueOf(i);//문자열로 변환
            //0과5가 있는지 비교하며 그 나머지 값은 존재하지 않는경우 list에 추가.
            if((s.contains("0")||s.contains("5"))&&!s.contains("1")&&!s.contains("2")&&!s.contains("3")
            		&&!s.contains("4")&&!s.contains("6")&&!s.contains("7")&&!s.contains("8")&&!s.contains("9")){
                list.add(Integer.parseInt(s));
            }
        }
       
        if(list.isEmpty()) {
        	answer=new int[1];
        	answer[0]=-1;
        }else {
        	 answer = new int[list.size()];
        	for(int i=0;i<answer.length;i++){
                answer[i]=(int)list.get(i);
            }
        }
        return answer;
    }
}

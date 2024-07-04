import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        List list = new ArrayList();
       for(int i=0;i<str_list.length;i++){
           if(str_list[i].equals("l")) { //str_list값이 "l"인 경우
        	   for(int j=0;j<i;j++) { //왼쪽에 있는 값들을 리스트에 저장
        		   list.add(str_list[j]);
        	   }
        	   break;
           }else if(str_list[i].equals("r")) { //str_list값이 "r"인경우
        	   for(int j=i+1;j<str_list.length;j++) { //오른쪽에 있는 값들을 리스트에 저장.
        		   list.add(str_list[j]);
        	   }
        	   break;
           }
       }
      answer = new String[list.size()];
      for(int i=0;i<answer.length;i++) {
    	  answer[i]=(String)list.get(i);
      }
        return answer;
    }
}

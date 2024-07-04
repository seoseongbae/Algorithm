import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        List list = new ArrayList();
	   String[] str = myStr.split("a|b|c"); //str배열에 a,b,c로 잘라서 대입.
	   String[] answer;
	   if(str.length==0) { //str배열의 길이가 0이면 answer배열에 empty 추가.
		   answer= new String[1];
		   answer[0]="EMPTY";
	   }else{ //str배열의 길이가 0이 아니면
		   for(int i=0;i<str.length;i++) {
			   if(!str[i].equals("")) { //공백이 아닌것만 list에 저장.
				   list.add(str[i]);
			   }
		   }
		   answer = new String[list.size()];
		   for(int i=0;i<answer.length;i++) {
			   answer[i]=(String)list.get(i);
		   } 
	   }
        
        return answer;
    }
}

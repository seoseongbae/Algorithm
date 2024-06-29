import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] str=my_string.split(" "); //공백으로 각각 나눠 배열에 대입
		List list = new ArrayList();
		for(int i=0;i<str.length;i++) {
			if(!str[i].equals("")) { //배열안에 있는 값이 빈칸이 아닐 경우
				list.add(str[i]);
			}
		}
		String[] answer= new String[list.size()];
		for(int i=0;i<answer.length;i++) {
			answer[i]=(String) list.get(i);
		}
        return answer;
    }
}

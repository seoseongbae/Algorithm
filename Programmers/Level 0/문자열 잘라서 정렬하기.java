import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
		List list = new ArrayList();
		for(int i=0;i<str.length;i++) {
			if(!str[i].equals("")) {//배열안에 빈값이 아닌경우에만 list에 추가
				list.add(str[i]);
			}
		}
        Collections.sort(list);
		String[] answer = (String[]) list.toArray(new String[list.size()]); //list를 배열로 변환
        return answer;
    }
}

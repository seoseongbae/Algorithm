import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        List list = new ArrayList();
		for(int i=1;i<food.length;i++) { //food배열에 있는 값 확인후
			for(int j=0;j<food[i]/2;j++) { //그 값에 나누기 2를 하여 list에 값을 넣어준다.
				list.add(i);
			}
		}
		for(int i=list.size()-1;i>=0;i--) {  //넣어준것에 역순으로 list에 값을 다시 대입
			list.add(list.get(i));
		}
		list.add(list.size()/2,0); //사이에 물을 집어넣어야함으로 중간값찾아 0대입
		
		for (Object object : list) {
			answer+=object;
		}
        return answer;
    }
}

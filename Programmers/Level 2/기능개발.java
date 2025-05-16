import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<progresses.length;i++) {
			int num = 100-progresses[i];
			
			if(num%speeds[i]==0) {
				list.add(num/speeds[i]);
			} else {
				list.add(num/speeds[i]+1);
			}
			
		}
		List<Integer> ansList = new ArrayList<Integer>();
		int max = list.get(0); //초기값 설정
		int cnt = 1;
		for(int i=1;i<list.size();i++) {
			if(max>=list.get(i)) {
				cnt++;
				
			} else {
				max = list.get(i);
				ansList.add(cnt);
				cnt=1;
			}
			if(i==list.size()-1) {
				ansList.add(cnt);
			}
			
		}
		
		int[] answer= new int[ansList.size()];
		
		for(int i=0;i<answer.length;i++) {
			answer[i] = ansList.get(i);
		}
        return answer;
    }
}

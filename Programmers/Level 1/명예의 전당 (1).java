//score값을 list를 생성하여 3개씩 판별하여 값을 구함
import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
       int[] answer=new int[score.length];
		List list = new ArrayList();
		for(int i=0;i<score.length;i++)
		{
			if(list.size()!=k) { //list의 크기가 k값이 아닐경우
				list.add(score[i]);
				if(list.size()!=0) {
					Collections.sort(list);
					answer[i]=(int) list.get(0);					
				}else {
					answer[i]=(int) list.get(i);
				}
			}else { //list크기가 k값보다 커질경우
				Collections.sort(list);
				if(score[i]>(int)list.get(0)) { //정렬하여 최소값보다 클경우 삭제 후 list 추가.
					list.remove(0); //list 0번쨰 있는 값 삭제
					list.add(score[i]);// 값 대입
					Collections.sort(list);
					answer[i]=(int)list.get(0);
				}else {//score값이 최소값보다 작을경우 최소값 대입
					answer[i]=(int)list.get(0);
				}
			}
		}
        return answer;
    }
}

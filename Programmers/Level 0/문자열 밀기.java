import java.util.*;

class Solution {
	public int solution(String A, String B) {
		int answer = 0;
		String chk = "";
		if (A.equals(B)) { //A와 B가 같을경우 answer = 0
			answer = 0;
		} else {
			List list = new ArrayList();
			for (int i = 0; i < A.length(); i++) { //list에 값 저장
				list.add(String.valueOf(A.charAt(i)));
			}
			int count = 0;
			while (true) {
				String c = (String) list.get(list.size() - 1); // 맨 뒤에 있는 값을 삭제하고 그 값을 앞으로 가져오기.
				list.remove(list.size() - 1);
				list.add(0, c); 
				for (int i = 0; i < list.size(); i++) { //list 값을 String 문자열로 변환
					chk += list.get(i);
				}
				count++;
				if (chk.equals(B)) { //B 값과 chk 값이 같을 경우 count 값을 answer에 대입 후 while문 종료.
					answer = count;
					break;
				} else if (count == A.length()) {
					answer = -1;
					break;
				}
				chk = "";
			}
		}
		return answer;
	}
}

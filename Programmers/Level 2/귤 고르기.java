import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum=0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : tangerine) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			} else {
				map.put(i, 1);
			}
		}
		
		List<Integer> list = new ArrayList<>(map.values()); //map에있는 값을 리스트로 변환
		Collections.sort(list, Collections.reverseOrder()); //내림차순 정렬
		for (Integer integer : list) {
			if(sum + integer >= k) {
				answer++;
				break;
			} else {
				sum += integer;
				answer++;
			}
		}
        return answer;
    }
}

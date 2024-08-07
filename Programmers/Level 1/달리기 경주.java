import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        int num = 0;
		Map<String,Integer>map = new HashMap<String, Integer>();
		for(int i=0;i<players.length;i++) { //players배열에 있는 정보를 맵에 저장
			map.put(players[i], i);
		}
		for(int i=0;i<callings.length;i++) { 
			num = map.get(callings[i]);
			
			String tmp = players[num-1];
			players[num-1] = players[num];
			players[num] = tmp;
			
			map.put(players[num],num);
			map.put(players[num-1],num-1);
			
		}
		answer = players.clone();
        return answer;
    }
}

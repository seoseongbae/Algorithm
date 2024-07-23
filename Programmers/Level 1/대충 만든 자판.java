import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>(); //비교할 값 넣어줄 map 생성

        for(int i=0;i<keymap.length;i++) {
        	for(int j=0;j<keymap[i].length();j++) {
        		char key = keymap[i].charAt(j);
        		if(map.containsKey(key)) { //map에 keymap[i]를 한단어로 나눈 값이 존재하면
        			int idx = map.get(key); //그 위치를 반환
        			map.put(key, Math.min(idx, j+1)); //idx와 j+1 최소값 을 구함.
        		}else {
        			map.put(key, j+1);
        		}
        	}
        }

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                char key = targets[i].charAt(j);

                if (map.containsKey(key)) {
                    answer[i] += map.get(key);
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}

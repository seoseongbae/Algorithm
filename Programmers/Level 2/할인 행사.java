import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int k=0; k<want.length; k++) {
			map.put(want[k], number[k]);
		}
		
		for(int i=0; i<discount.length-9; i++) { //14일중 10일연속으로 처리해야하기 때문
			Map<String, Integer> mapd = new HashMap<String, Integer>();
			//discount[i] 값이 map에 존재하는지 확인
			if(map.containsKey(discount[i])) {
				for(int j=i;j<i+10;j++) {
					mapd.put(discount[j], mapd.getOrDefault(discount[j],0)+1);
				}
				int cnt = 0;
				for (String mapKey : mapd.keySet()) 
				{
				    if(map.get(mapKey) != mapd.get(mapKey)) {
				    	cnt++;
				    	break;
				    }
				}
				if(cnt==0) {
					answer++;
				}
			} else {
				continue;
			}
		}
        return answer;
    }
}

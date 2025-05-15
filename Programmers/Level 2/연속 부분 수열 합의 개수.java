import java.util.*;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<Integer>();
		for(int i=1;i<=elements.length;i++) { //길이 범위
			for(int j=0;j<elements.length;j++) {
				int value=0;
				for (int k = j; k < j + i; k++) {
                    value += elements[k % elements.length];
                }
                set.add(value);
			}
			
		}
		int answer = set.size();
        
        return answer;
    }
}

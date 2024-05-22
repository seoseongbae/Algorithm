------
hashset을 이용하여 값 존재여부 확인하여 없으면 값을 넣어 그 값에 대한 길이를 반환
import java.util.*;
class Solution {
    public int solution(int[] nums) {
       int answer=0;
		HashSet<Integer> hash =new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(!hash.contains(nums[i]))
			hash.add(nums[i]);
		}
		if(hash.size()>nums.length/2) {
			answer=nums.length/2;
		}else {
			answer= hash.size();
		}
        return answer;
    }
}

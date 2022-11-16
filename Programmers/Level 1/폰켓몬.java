import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int max=nums.length/2;
        int answer = 0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        if(max>=set.size())
        {
            answer=set.size();    
        }else{
           answer=max;
        }
        return answer;
    }
}

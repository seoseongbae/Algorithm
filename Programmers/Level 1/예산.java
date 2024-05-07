import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=0;i<d.length;i++)
        {
            if(d[i]<=budget)
            {
                budget-=d[i];
                answer++;
            }else{
                break;
            }
            
        }
         return answer;   
    }
}
----------------------------------------------------
최대한 많은 부서에 예산을 지급해야하므로 budget보다 적게 부서에 많이 지급해야함으로
sort후 sum값에 더한뒤 budget보다 적을떄까지 count해준다.
import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum=0;
        Arrays.sort(d);
        for(int i=0;i<d.length;i++){
            sum+=d[i];
            if(sum<=budget){
              answer++;  
            }else{
                break;
            }
        }
        return answer;
    }
}

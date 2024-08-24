//점프와 순간 이동
import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        while(n!=0){
            if(n%2==0){//순간이동 할 경우
                n/=2;
            }else{//점프할 경우
                n--;
                ans++;
            }
        }

        return ans;
    }
}

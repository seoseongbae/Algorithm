//에라토스테네스의 체를 이용하여 소수 판별.
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum=0;
       for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    sum = nums[i]+nums[j]+nums[k];
                    if(isPrime(sum)){
                        answer++;
                    }
                }
            }
       }
        return answer;
    }

private boolean isPrime(int num){ 
        for(int i=2; i<num; i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
-----------------------------------------------
다시 풀어본 코드.
class Solution {
    public int solution(int[] nums) {
		int answer= 0;
		for(int i=0;i<nums.length-2;i++) {
			for(int j=i+1;j<nums.length-1;j++) {
				for(int k=j+1;k<nums.length;k++) {
					int sum=nums[i]+nums[j]+nums[k];
					boolean chk = isprime(sum);
					if(chk==true) {
						answer++;
					}
				}
			}
		}
        return answer;
    }
    public static boolean isprime(int n) {
		if(n<2){
            return false; // 1은 소수가 아니기에 false
        }else{
            for(int i = 2; i < n; i++){
                if(n % i == 0) return false; // 나머지연산을 했을 때 0이 나오면 소수가 아니므로 false
            }
            return true; // 위의 case
        }
	}
}

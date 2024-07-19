class Solution {
    public int solution(int n) {
     int answer = 0; 
     boolean[] prime = new boolean [n+1]; 
     for(int i=2; i<=n ; i++)
     {
        prime[i]=true;  
     }
       
     int root=(int)Math.sqrt(n); 
     for(int i=2; i<=root; i++)
     { 
        if(prime[i]==true)
        { 
            for(int j=i; i*j<=n; j++)
            {
                prime[i*j]=false; 
            }
         } 
      } 
      for(int i =2; i<=n; i++) 
      { 
        if(prime[i]==true)
        {
            answer++;
        } 
      } 
      return answer;
    }
}
-------------------------------------------------------------------
다시 풀어본 코드
    class Solution {
 public int solution(int n) {
        int answer = 1; //2는 소수이기때문에 초기값 1로 선언
        for(int i=3;i<=n;i++){
            if(isprime(i)){
                answer++;
            }
        }
        return answer;
    }
    public static boolean isprime(int n) {
            for(int i = 2; i <= (int)Math.sqrt(n); i++){ //2부터 n의제곱근까지 반복
                if(n % i == 0) return false; 
            }
            return true; 
        }
}

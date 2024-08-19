class Solution {
    public int solution(int n) {
        int answer[] =new int[n+1];
        
        for(int i=0;i<=n;i++)
        {
            if(i==0)
            {
                answer[i]=0;
            }
            else if(i==1)
            {
                answer[i]=1;
            }
            else{
                int sum=answer[i-2]+answer[i-1];
                answer[i]=sum%1234567;
            }
        }
        return answer[n];
}
}
------------------------------------------------
다시 푼 문제
//재귀 함수로 호출할 경우 중복연산과 불필요한 메모리 사용을 하여 시간초과 실패가 떠 동적계획법을 이용하여 풀이
class Solution {
    public int solution(int n) {
        int answer = fn(n);
        return answer;
    }
    
    
    public int fn(int n){
       int[] arr = new int[n+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<=n;i++) {
			arr[i] = (arr[i-1]+arr[i-2])%1234567;
		}
		return arr[n];
    }
}

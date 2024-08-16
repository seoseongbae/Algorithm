class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
              int sum = 0;
              for(int j=i; j<=n; j++) {
                  sum += j;
                  
                  if(sum==n) {
                      answer++;
                      break;
                  } else if(sum>n) {
                      break;
                  }
              }
          }      
        return answer;
    }
}
------------------------------------------
//다시 푼 코드
class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
		int sum=0;
		while(true) {
			for(int j=i;j<=n;j++) {
				sum+=j;	
				if(sum==n) {
					answer++;
					break;
				}
				if(sum>n) { //sum 값이 n보다 커지면 시간을 많이 잡아먹어 커지면 break로 for문을 벗어나게함.
					break;
				}
			}
			if(i==n) {
				break;
			}
			i++;
			sum=0;
			
		}
        return answer;
    }
}

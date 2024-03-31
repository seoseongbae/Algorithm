--이 문제는 조합을 사용하여 주어진 숫자에서 몇개를 순서없이 뽑는 것이다.

class Solution {
     public int solution(int balls, int share) {
        int answer = 0;
        answer = combination(balls, share);
        return answer;
    }
    
    public int combination(int n, int m){
        if( m == 0 || n == m) {
            return 1;
        }else{ 
            return combination(n-1, m-1) 
              + combination(n-1, m);
        }
    }
}

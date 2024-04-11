class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a%2==1&&b%2==1) {//a와 b가 홀수이면
			answer=(int)Math.pow(a,2)+(int)Math.pow(b, 2);//제곱함수(Math.pow)를 사용하여 answer에 대입
		}
		else if(a%2==1&&b%2!=1||a%2!=1&&b%2==1) {//둘중 하나만 홀수 일 경우
			answer=2*(a+b);
		}
		else {//둘다 짝수일경우
			answer=Math.abs(a-b);
		}
        return answer;
    }
}

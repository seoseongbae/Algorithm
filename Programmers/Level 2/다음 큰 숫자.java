class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = Integer.bitCount(n); // bitcount 2진수 변환시 1의 갯수 확인 메소드
		while(true) {
			n++;
			if(a == Integer.bitCount(n)) {
				answer = n;
				break;
			}
		}
        return answer;
    }
}

--n의 구간이 1부터 100까지여서 100자리수까지 비교를 해야함.
class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
		String s = "";
		for (int i = 1; i <= 1000; i++) {
			s = String.valueOf(i);
			if(i>=100) {
				if(i % 3 == 0 || s.charAt(1) == '3' || s.charAt(0) == '3'||s.charAt(2)=='3') {
					continue;
				}
			}
			else if (i >= 10) {
				if (i % 3 == 0 || s.charAt(1) == '3' || s.charAt(0) == '3') {
					continue;
				}
			} else if (i <= 9) {
				if (i % 3 == 0 || s.charAt(0) == '3') {
					continue;
				}
			}
			count++;
			if (count == n) {
				answer = i;
				break;
			}
		}
        return answer;
    }
}

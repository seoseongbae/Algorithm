class Solution {
    public int solution(int chicken) {
        int answer = -1;
        if(chicken>=10) {
			while (chicken >= 10) {
				if (answer == -1) {
					answer = chicken / 10;
					chicken = chicken % 10 + chicken / 10;
				} else {
					answer += chicken / 10;
					chicken = (chicken % 10) + chicken / 10;
				}

			}
		}else {
			answer=0;
		}
        return answer;
    }
}

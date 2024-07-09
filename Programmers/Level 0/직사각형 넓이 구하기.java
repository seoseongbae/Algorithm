class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0]; //최소값으로 dots[0][0] 설정
		int x2 = 0;
		int y1 = dots[0][1]; //최소값으로 dots[0][1] 설정
		int y2 = 0;
		for (int i = 1; i < dots.length; i++) {
			if (dots[i][0] > x1) { //dots[i][0]이 x1클경우 x2 dots[i][0]값을 추가.
				x2 = dots[i][0];
			} else if (dots[i][0] < x1) { //작을경우 x1값에 dots[i][0]값을 넣고 x2에 x1값을 추가.
				int temp = x1;
				x1 = dots[i][0];
				x2 = temp;
			}
			if (dots[i][1] > y1) {
				y2 = dots[i][1];
			} else if (dots[i][1] < y1) {
				int temp = x1;
				x1 = dots[i][1];
				x2 = temp;
			}
		}
		answer = (x2-x1)*(y2-y1);
        return answer;
    }
}

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int row=0;
		int col=0;
		int count=1;
		int direction =0;
		while(count<=n*n) { //count가 n*n보다 작을때까지
			answer[row][col] = count++;
			if (direction == 0) {
                if (col == n - 1 || answer[row][col + 1] != 0) { //col이 n-1이거나 col+1값이 0이 아닐경우
                    direction = 1;
                    row++;
                } else {
                    col++;
                }
            } else if (direction == 1) {
                if (row == n - 1 || answer[row + 1][col] != 0) { //row가 n-1이거나 row+1값이 0이 아닐경우
                    direction = 2;
                    col--;
                } else {
                    row++;
                }
            } else if (direction == 2) {
                if (col == 0 || answer[row][col - 1] != 0) { //col이 0이거나 col-1값이 0이 아닐경우
                    direction = 3;
                    row--;
                } else {
                    col--;
                }
            } else if (direction == 3) {
                if (row == 0 || answer[row - 1][col] != 0) { //row가 0이 거나 row-1값이 0이 아닐경우
                    direction = 0;
                    col++;
                } else {
                    row--;
                }
            }
		}
        return answer;
    }
}

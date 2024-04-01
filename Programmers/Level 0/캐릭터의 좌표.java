/*조건  *board은 [가로 크기, 세로 크기] 형태로 주어집니다.
     *board의 가로 크기와 세로 크기는 홀수입니다.
     *board의 크기를 벗어난 방향키 입력은 무시합니다.*/
//범위를 벗어나면 범위최대,최소값으로 변환해야하며, 값을 넣어줄때 조건을 확인하게 해줘야 한다.
// 범위 ex) 11 이면 -5 ~5
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for (int i = 0; i < keyinput.length; i++) {
			if (keyinput[i].equals("left")) {
				answer[0] += -1;
				if (answer[0] < -(board[0] / 2)) {
					answer[0] = -(board[0] / 2);
				}
			} else if (keyinput[i].equals("right")) {
				answer[0] += 1;
				if (answer[0] > board[0] / 2) {
					answer[0] = board[0] / 2;
				}
			} else if (keyinput[i].equals("up")) {
				answer[1] += 1;
				if (answer[1] > board[1] / 2) {
					answer[1] = board[1] / 2;
				}
			} else if (keyinput[i].equals("down")) {
				answer[1] += -1;
				if (answer[1] < -(board[1] / 2)) {
					answer[1] = -(board[1] / 2);
				}
			}
		}
        return answer;
    }
}

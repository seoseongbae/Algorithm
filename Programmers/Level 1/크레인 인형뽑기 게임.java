import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
       int answer=0;
		
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<moves.length;i++) {
			for(int j=0;j<board.length;j++) {
				if(board[j][moves[i]-1]!=0) { //배열은 0부터 시작하기때문
					if(stack.isEmpty()) { //스택안에 비어있는지 확인
						stack.push(board[j][moves[i]-1]);
					}else {
						if(stack.peek()==board[j][moves[i]-1]) { //제일 위에있는 값이 같을 경우
							stack.pop();
							answer+=2; //터트릴떄 2개가 같이 터짐으로 +2를해줌.
						}else {
							stack.push(board[j][moves[i]-1]);
						}
					}
					
					board[j][moves[i]-1]=0; //꺼낼때 그 부분을 0으로 초기화
					break;
				}
			}
		}
        return answer;
    }
}

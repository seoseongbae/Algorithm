class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(i+j<=k){ //i+j가 k보다 작거나 같은경우 answer에 대입
                    answer+=board[i][j];
                }
            }
        }
        return answer;
    }
}

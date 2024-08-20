class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for (int i = 3; i < sum; i++) { 노란색 격자가 무조건 1줄이 나올려면 세로는 3칸 이상이여야 함.
            int j = sum / i;
            
            if (sum % i == 0 && j >= 3) { //전체카펫에 i를 나눈값이 0이거나 가로가 3이상인경우
                int col = Math.max(i, j); 
                int row = Math.min(i, j);
                int center = (col - 2) * (row - 2);
                
                if (center == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    break;
                }
            }
        }
        return answer;
    }
}

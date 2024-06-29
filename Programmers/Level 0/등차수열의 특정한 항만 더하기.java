class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int num=a;
        for(int i=0;i<included.length;i++){
            if(included[i]){ //불리언 배열 값이 참인경우
                answer+=num;
            }
            num+=d;
        }
        return answer;
    }
}

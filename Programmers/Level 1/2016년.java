class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"}; //요일을 배열로 선언
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31}; //윤년의 해당 일을 선언
        int dd = 0;

        for(int i = 0; i < a-1; i++){ //배열은 이전달까지 구해야하기 때문에 a-1로 하여 1월부터 4월까지 불러옴
            dd += date[i];
        }
        dd += b - 1; // 인덱스는 0부터 시작하기 때문에 b-1로 추가

        return day[dd % 7];
    }
}

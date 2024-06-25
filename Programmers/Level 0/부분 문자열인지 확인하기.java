class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        if(my_string.contains(target)){ //contains 문자 비교 함수 사용
            answer=1;
        }
        return answer;
    }
}

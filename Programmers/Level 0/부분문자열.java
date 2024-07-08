class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str2.contains(str1)){ //str1값이 str2에 존재하는지 확인
            answer=1;
        }
        return answer;
    }
}

class Solution {
    public String solution(String n_str) {
        String answer = "";
        int n=0;
        for(int i=0;i<n_str.length();i++){ //n_str를 첨부터 하나씩 문자를 찾기위한 for문
            if(n_str.charAt(i)!='0'){ //문자가0이 아닐경우 그 i번째를 저장하고 for문 종료
                n=i;
                break;
            }
        }
        answer=n_str.substring(n); // i번째 부터 substring으로 잘라 대입
        return answer;
    }
}

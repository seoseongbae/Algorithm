class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i=0;i<=myString.length()-pat.length();i++){
            if(myString.substring(i,i+pat.length()).equals(pat)){//pat의 길이만큼 자른 문자열이 pat과 같은지 비교
                answer++;
            }
        }
        return answer;
    }
}

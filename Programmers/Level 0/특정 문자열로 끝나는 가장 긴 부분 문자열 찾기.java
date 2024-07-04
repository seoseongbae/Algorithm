class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int in = myString.lastIndexOf(pat); //뒤에부터 pat의 값 index번호 찾아 in에 대입
		answer = myString.substring(0,in+pat.length()); // substring함수를 이용하여 0부터 pat문자가 있는곳 까지 자르기.
        return answer;
    }
}

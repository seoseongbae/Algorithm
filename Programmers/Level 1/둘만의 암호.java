class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) { //s문자열에 문자 하나씩 꺼내기 위해 포문 사용
			char c = s.charAt(i);  //문자 하나씩 꺼내기
			for (int j = 0; j < index; j++) { //0부터index까지 반복문
				c += 1;  //문자를 1나 다음으로 증가
				if (c > 'z') { // z보다 크면 문자에 -26를 해줌
					c -= 26;
				}
				if (skip.contains(String.valueOf(c))) { //c변수안에 있는 문자가 skip에 존재하면 j를 1 빼줌.
					j--;
				}
			}
			answer += c;
		}
        return answer;
    }
}

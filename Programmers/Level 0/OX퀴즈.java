class Solution {
    public String[] solution(String[] quiz) {
        String[] answer=new String[quiz.length];
		for(int i=0;i<quiz.length;i++) {
			String[] str = quiz[i].split(" "); // 공백을 기준으로 나눠 str배열에 값을 넣는다.
			int num1 = Integer.parseInt(str[0]);
			int num2 = Integer.parseInt(str[2]);
			if(str[1].equals("+")) { //연산자가 + 일경
				if((num1+num2)==Integer.parseInt(str[4])) { //num1과num2를 더한값이 str배열에 4번째 값과 같으면 O,아니면 X
					answer[i]="O";
				}else {
					answer[i]="X";
				}
			}else if(str[1].equals("-")) { //연산자가 -일경우
				if((num1-num2)==Integer.parseInt(str[4])) {
					answer[i]="O";
				}else {
					answer[i]="X";
				}
			}
		}
        return answer;
    }
}

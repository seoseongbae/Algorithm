class Solution {
    public String solution(String my_string, int m, int c) {
        String [] str= my_string.split("");//split함수를 이용하여 1차원 배열에 대입
		String[][] str2=new String[my_string.length()/m][m]; 2차원 배열에 담아 c열에 있는것만 꺼내와야함으로 m개씩 들어가는 2차원 배열 생성
		int count=0;
		for(int i =0;i<str2.length;i++) {
			for(int j=0;j<str2[i].length;j++) {
				str2[i][j]=str[count++]; //2차원 배열에 str배열 값 대입
			}
		}
		String answer="";
		for(int i=0;i<str2.length;i++) {
			answer+=str2[i][c-1]; //answer에 c열에 있는 값 추가, 단 배열에서는 0부터 시작이므로 c-1을 해줘야한다.
		}
        return answer;
    }
}

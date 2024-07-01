class Solution {
    public int[] solution(String myString) {
       String[] str=myString.split("x",-1); //끝 공간에 공백을 추가하려면
                                            //limit를 -1 또는 공백처리 해야하는 숫자를 입력해야한다.
		int answer[]=new int[str.length];
		for(int i=0;i<str.length;i++) {
			answer[i]=str[i].length();
		}
        return answer;
    }
}

class Solution {
    public int solution(String binomial) {
        String[] str= binomial.split(" "); //공백에 따라 split함수로 나눔.
		int a=0;
		int b=0;
		String op="";
		int answer=0;		
		a=Integer.parseInt(str[0]);
		op=str[1];
		b=Integer.parseInt(str[2]);
		if(op.equals("+")) {
			answer=a+b;
		}else if(op.equals("-")) {
			answer=a-b;
		}else if(op.equals("*")) {
			answer=a*b;
		}else if(op.equals("/")) {
			answer=a/b;
		}
        return answer;
    }
}

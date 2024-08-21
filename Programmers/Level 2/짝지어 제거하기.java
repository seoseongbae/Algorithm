import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer=0;
		Stack stack = new Stack();
        
        for(int i=0;i<s.length();i++){
            String str = String.valueOf(s.charAt(i)); //string형으로 문자를 변환하여 저장
            if(stack.isEmpty()) { //스택이 비어있으면 스택에 추가
            	stack.push(str);
            }else { //비어있지 않다면
                if(stack.peek().equals(str)){ //제일 마지막에 넣은 값과 현재값이 같다면
                   stack.pop();  //스택에서 제거
                }else{ //제일 마지막에 넣은 값과 현재값이 다르다면
                    stack.push(str); //스택에 추가
                }
            }
        }
        if(stack.isEmpty()) {
        	answer=1;
        }

        return answer;
    }
}

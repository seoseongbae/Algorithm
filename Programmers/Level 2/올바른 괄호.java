import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[]str=s.split("");
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push('(');    
            }
            else{
                if(stack.isEmpty())
                {
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        answer=(stack.isEmpty())?true:false;
        
        return answer;
    }
}
------------------------------------------------------
//다시 풀어본 코드
import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stack =new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {  //문자가 '('일 경우 스택에 추가
				stack.push(s.charAt(i));
			}else if(s.charAt(i)==')') { //문자가 ')'일 경우 
				if(stack.isEmpty()) { //스택안에가 비어있다면
					answer=false; // answer = false로 반환
					break;
				}
				stack.pop(); // 스택에서 제거
			}
		}
        if(!stack.isEmpty()) { //스택안에가 비어있지 않다면 false;
                    answer=false; 
        }
        return answer;
    }
}

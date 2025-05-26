import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String s;
		while (true) {
			s = sc.nextLine();

			if (s.equals(".")) {
				break;
			}
			System.out.println(solve(s));
		}

	}

	public static String solve(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.empty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			}

			else if (c == ']') {
				if (stack.empty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}
		if (stack.empty()) {
			return "yes";
		} else {
			return "no";
		}

	}

}
------------------------------------------------------------------------------
#다시 풀어본 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        while(true) {
	        	String str = br.readLine();
	        	if(str.equals(".")) {
	        		break;
	        	}
	
	        	String res = str.replaceAll("[^\\[\\]()]", "");
	        	if(res.length()==0) {
	        		System.out.println("yes");
	        	} else {
		        	String[] arrSt = res.split("");
		        	Stack<String> stack = new Stack<String>();
		        	for (String s : arrSt) {
		        		if(stack.isEmpty()) {
		        			stack.push(s);
		        		} else {
		        			if(s.equals(")")) {
		        				if(stack.peek().equals("(")) {
		        					stack.pop();
		        				} else {
		        					stack.push(s);
		        				}
		        			} else if(s.equals("]")) {
		        				if (stack.peek().equals("[")) {
		        					stack.pop();
		        				} else {
		        					stack.push(s);
		        				}
		        			} else {
		        				stack.push(s);
		        			}
		        		}
				}
		        	if(stack.isEmpty()) {
		        		System.out.println("yes");
		        	} else {
		        		System.out.println("no");
		        	}
	        	}
	        }
	}
}

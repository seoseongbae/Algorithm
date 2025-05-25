import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			System.out.println(solve(sc.next()));
		}
	}
	public static String solve(String s)
	{
		Stack<Character>stack=new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='(')
			{
				stack.push(c);
			}
			else if(stack.empty())
			{
				return "NO";
			}
			else
			{
				stack.pop();
			}
		}
		if(stack.empty())
		{
			return "YES";
		}
		else {
			return "NO";
		}
		
	}
}

---------------------------------------------------------------
#다시 푼 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 
        
        for(int i=0;i<n;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String str = st.nextToken();
        	Stack<String> stack = new Stack<String>();
        	
        	String[] s = str.split("");
        	
        	for (int j=0; j<s.length; j++) {
        		if(s[j].equals("(")) {
        			stack.push(s[j]);
        		} else {
        			if(!stack.isEmpty()) {
        				if(stack.peek().equals("(")) {
        					stack.pop();
        				} else {
        					stack.push(s[j]);
        				}
        			} else {
        				stack.push(s[j]);
        			}
        		}
        	}                                                                                                                                                                                         
        	
        	if(stack.isEmpty()) {
        		System.out.println("YES");
        	} else {
        		System.out.println("NO");
        	}
        	
        }
	}
}

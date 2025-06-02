import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb =new StringBuilder();
		Stack<Integer>stack=new Stack<>();
		int a=sc.nextInt();
		
		int start=0;
		while(a-->0)
		{
			int v=sc.nextInt();
			if(v>start)
			{
				for(int i=start+1;i<=v;i++)
				{
					stack.push(i);
					sb.append('+').append('\n');
				}
				start=v;
			}
			else if(stack.peek()!=v)
			{
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append('-').append('\n');
		}
	
		System.out.println(sb);
	}
}
---------------------------------------------------------------------
#다시푼문제
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); 
		
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		
		int start = 0;
	
		while(n-- > 0) {
			
			int value = Integer.parseInt(br.readLine());
			
			if(value > start) {
				for(int i = start + 1; i <= value; i++) {
					stack.push(i);
					sb.append("+\n");
				}
				start = value; 	
			} else if(stack.peek() != value) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append("-\n");
		}
		System.out.println(sb.toString());

	}
}

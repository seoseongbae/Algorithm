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


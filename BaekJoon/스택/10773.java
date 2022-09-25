import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args)throws IOException {
		Scanner sc= new Scanner(System.in);
		Stack<Integer>stack=new Stack<Integer>();
		int n =sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			if(a!=0)
			{
				stack.push(a);
			}
			else if(a==0)
			{
				stack.pop();
			}
		}
		int sum=0;
		for(int i:stack)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
}


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
------------------------------------------------------------------------
#다시 푼 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            
            if(!stack.isEmpty()) {
            	if(num == 0 ) {
            		stack.pop();
            	} else {
            		stack.push(num);
            	}
            } else {
            	stack.push(num);
            }
     
        }
        int sum = 0;
        while(true) {
        	if(stack.isEmpty()) {
        		break;
        	}
        	sum += stack.pop();
        }
        System.out.print(sum);
	}
}

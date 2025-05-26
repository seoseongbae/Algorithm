import java.util.*;
import java.io.*;

public class Main {

	public static int[] stack;
	public static int size=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n=sc.nextInt();
		stack=new int[n];
		
		for(int i=0;i<n;i++)
		{
			String str=sc.next();
			switch(str)
			{
			case "push":
				push(sc.nextInt());
				break;
			case "pop":
				sb.append(pop()).append('\n');
				break;
			case "size":
				sb.append(size()).append('\n');
				break;
			case "empty":
				sb.append(empty()).append('\n');
				break;
			case "top":
				sb.append(top()).append('\n');
				break;
				
			}
		}
		System.out.println(sb);
		
	}
	public static void push(int a) {
		stack[size] = a;
		size++;
	}
    
	public static int pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int res = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return res;
		}
	}
    
	public static int size() {
		return size;
	}
    
	public static int empty() {
		if(size == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
    
	public static int top() {
		if(size == 0) {
			return -1;
		}
		else {
			return stack[size - 1];
		}
	}
}
----------------------------------------------------------
#다시 푼 문제
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
        	Stack<Integer> stack = new Stack<Integer>();
		for (int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push":
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(stack.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.peek());
					stack.pop();
				}
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if(stack.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				break;
			case "top":
				if(stack.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.peek());
				}
				break;
			}
		}
	}
}


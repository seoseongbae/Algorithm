import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<Integer>();
		int a = Integer.parseInt(br.readLine());
		int c=-1;
		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			String b=st.nextToken();
			switch(b)
			{
			case"push":
				c=Integer.parseInt(st.nextToken());
				queue.offer(c);
				break;
			case"pop":
				if(queue.isEmpty())
				{
					sb.append("-1").append("\n");
					break;
				}
				sb.append(queue.poll()).append("\n");
				break;
			case"size":
				sb.append(queue.size()).append("\n");
				break;
			case"empty":
				sb.append(queue.isEmpty()? 1:0).append("\n");
				break;
			case"front":
				sb.append(queue.isEmpty()?-1:queue.peek()).append("\n");
				break;
			case"back":
				sb.append(queue.isEmpty()?-1:c).append("\n");
				break;
			}
			
		}
		System.out.println(sb);
	}
}
---------------------------------------------------------------------------------------
#다시분 문제
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); 
		
		Deque<Integer> deq = new ArrayDeque<Integer>();
		for(int i=0; i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String ans = st.nextToken();
			switch (ans) {
			case "push":
				deq.offer(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				int val1 = -1;
				if(!deq.isEmpty()) {
					val1 = deq.pollFirst();
				}
				System.out.println(val1);
				break;
			case "size":
				System.out.println(deq.size());
				break;
			case "empty":
				int val2 = 0;
				if(deq.isEmpty()) {
					val2 = 1;
				}
				System.out.println(val2);
				break;
			case "front":
				int val3 = -1;
				if(!deq.isEmpty()) {
					val3 = deq.peekFirst();
				}
				System.out.println(val3);
				break;
			case "back":
				int val4 = -1;
				if(!deq.isEmpty()) {
					val4 = deq.peekLast();
				}
				System.out.println(val4);
				break;
			}
		}
	}
}

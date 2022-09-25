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

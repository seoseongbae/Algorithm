import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		for(int i=1;i<=n;i++)
		{
			queue.offer(i);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(queue.size()!=1)
		{
			for(int i=0;i<k-1;i++)
			{
				queue.offer(queue.poll());
			}
			sb.append(queue.poll()+", ");
		}
		sb.append(queue.poll()+">");
		bw.write(sb.toString()+"\n");
		bw.flush();
	}
}

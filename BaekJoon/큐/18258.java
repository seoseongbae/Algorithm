import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	
	public static boolean prime[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n=Integer.parseInt(br.readLine());
		int back=0;
		Queue<Integer> que =new LinkedList<>(); 
		
		for(int i=0;i<n;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			String s=st.nextToken();
			
			switch(s) {
			case "push":{
				int x=Integer.parseInt(st.nextToken());
				que.add(x);
				back=x;
				break;
			}
			case "pop":{
				if(que.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(que.poll()).append("\n");
				}
				break;
			}
			case "size":{
				sb.append(que.size()).append("\n");
				break;
			}
			case "empty":{
				if(que.isEmpty()) {
					sb.append(1).append("\n");
				}
				else {
					sb.append(0).append("\n");
				}
				break;
			}
			case"front":{
				if(que.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(que.peek()).append("\n");
				}
				break;
			}
			case "back": {
				if (que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(back).append("\n");
				}
				break;
			}
			default:
				break;
			}
			}
	System.out.println(sb);
	}
}
------------------------------------------------------------------------
#다시풀어본문제
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		Deque<Integer> que = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push":
				que.offer(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				int val1 = -1;
				if(!que.isEmpty()) {
					val1 = que.poll();
				}
				sb.append(val1 + "\n");
				break;
			case "size":
				sb.append(que.size()+"\n");
				break;
			case "empty":
				int val2=1;
				if(!que.isEmpty()) {
					val2 = 0;
				}
				sb.append(val2 + "\n");
				break;
			case "front":
				int val3= -1;
				if(!que.isEmpty()) {
					val3  = que.peek();
				}
				sb.append(val3 + "\n");
				break;
			case "back":
				int val4 = -1;
				if(!que.isEmpty()) {
					val4 = que.getLast();
				}
				sb.append(val4 + "\n");
				break;
			}
		}
		System.out.println(sb.toString());
	}	
}

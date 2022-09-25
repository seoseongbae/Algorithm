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

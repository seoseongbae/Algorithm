import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		PriorityQueue<Integer>que=new PriorityQueue<>();
		for(int i=0;i<n;i++)
		{
			int num=Integer.parseInt(br.readLine());
			if(num==0)
			{
				if(!que.isEmpty())
				{
					System.out.println(que.poll());
				}
				else {
					System.out.println(0);
				}
				continue;
			}
			que.add(num);
		}
	}

}

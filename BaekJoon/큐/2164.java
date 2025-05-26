import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> q = new LinkedList<>();
		
		int n=sc.nextInt();
		for(int i = 1; i <= n; i++) {
			q.offer(i);
		}
		while(q.size()>1)
		{
			q.poll();
			q.offer(q.poll());
		}
		System.out.println(q.poll());
	}
}
------------------------------------------------------------------------------
#다시 풀어봄
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		Queue<Integer> que = new LinkedList<>();
		
		for(int i=1;i<=num;i++) {
			que.add(i);
		}
		while(que.size()!=1) {
			//버리기
			que.poll();
			
			//뒤로 보내기
			int n = que.poll();
			que.offer(n);
			
		}
		System.out.println(que.poll());
	}
}

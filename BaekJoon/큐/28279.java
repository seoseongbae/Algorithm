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
		for (int i=0; i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int ans = Integer.parseInt(st.nextToken());
			switch (ans) {
			case 1:
				int val1 = Integer.parseInt(st.nextToken());
				deq.offerFirst(val1);
				break;
			case 2:
				int val2 = Integer.parseInt(st.nextToken());
				deq.offerLast(val2);
				break;
			case 3:
				int val3 = -1;
				if(!deq.isEmpty()) {
					val3 = deq.pollFirst();
				}
				System.out.println(val3);
				break;
			case 4:
				int val4 = -1;
				if(!deq.isEmpty()) {
					val4 = deq.pollLast();
				}
				System.out.println(val4);
				break;
			case 5:
				System.out.println(deq.size());
				break;
			case 6:
				int val6 = 0;
				if(deq.isEmpty()) {
					val6 = 1;
				}
				System.out.println(val6);
				break;
			case 7:
				int val7 = -1;
				if(!deq.isEmpty()) {
					val7 = deq.peekFirst();
				}
				System.out.println(val7);
				break;
			case 8:
				int val8 = -1;
				if(!deq.isEmpty()) {
					val8 = deq.peekLast();
				}
				System.out.println(val8);
				break;
			}
		}
	}

}

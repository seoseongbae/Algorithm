import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); 
		StringBuilder sb = new StringBuilder();
		Deque<int[]> deq = new ArrayDeque<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		//처음풍선은 바로 터지기 떄문에 미리 선언
		sb.append("1 ");
		int num = arr[0];
		
		for(int i=1; i<n; i++){
			deq.add(new int[] {(i+1), arr[i]});
		}
		
		while(!deq.isEmpty()) {
			if(num >0) { 
				for(int i=1; i<num; i++) {
					deq.offerLast(deq.pollFirst());
				}
				
				int[] nxt = deq.poll();
				num = nxt[1];
				sb.append(nxt[0]+" ");
			} 
			else {
				for(int i=1; i<-num; i++	) {
					deq.offerFirst(deq.pollLast());
				}
				
				int[] nxt = deq.pollLast();
				num = nxt[1];
				sb.append(nxt[0]+" ");
			}
		}
				
		System.out.println(sb.toString());
		
	}
}

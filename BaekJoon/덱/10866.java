import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();

		int n = Integer.parseInt(st.nextToken());
		 for (int i = 0; i < n; i++) {
	            String[] s = br.readLine().split(" ");

	            switch (s[0]) {
	                case "push_front":
	                    dq.addFirst(Integer.parseInt(s[1]));
	                    break;
	                case "push_back":
	                    dq.addLast(Integer.parseInt(s[1]));
	                    break;
	                case "pop_front":
	                    if (dq.isEmpty()) {
	                        sb.append(-1).append('\n');
	                    } else {
	                        sb.append(dq.pollFirst()).append('\n');
	                    }
	                    break;
	                case "pop_back":
	                    if (dq.isEmpty()) {
	                        sb.append(-1).append('\n');
	                    } else {
	                        sb.append(dq.pollLast()).append('\n');
	                    }
	                    break;
	                case "size":
	                    sb.append(dq.size()).append('\n');
	                    break;
	                case "empty":
	                    if (dq.isEmpty()) {
	                        sb.append(1).append('\n');
	                    } else {
	                        sb.append(0).append('\n');
	                    }
	                    break;
	                case "front":
	                    if (dq.isEmpty()) {
	                        sb.append(-1).append('\n');
	                    } else {
	                        sb.append(dq.peekFirst()).append('\n');
	                    }
	                    break;
	                case "back":
	                    if (dq.isEmpty()) {
	                        sb.append(-1).append('\n');
	                    } else {
	                        sb.append(dq.peekLast()).append('\n');
	                    }
	                    break;
	            }
	        }
	        System.out.println(sb);
	}
}
-------------------------------------------------------------------------------
#다시 푼 문제
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
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {
			case "push_front":
				deq.offerFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				deq.offerLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				int val1 = -1;
				if (!deq.isEmpty()) {
					val1 = deq.pollFirst();
				}
				System.out.println(val1);
				break;
			case "pop_back":
				int val2 = -1;
				if (!deq.isEmpty()) {
					val2 = deq.pollLast();
				}
				System.out.println(val2);
				break;
			case "size":
				System.out.println(deq.size());
				break;
			case "empty":
				int val3 = 0;
				if (deq.isEmpty()) {
					val3 = 1;
				}
				System.out.println(val3);
				break;
			case "front":
				int val4 = -1;
				if (!deq.isEmpty()) {
					val4 = deq.peekFirst();
				}
				System.out.println(val4);
				break;
			case "back":
				int val5 = -1;
				if (!deq.isEmpty()) {
					val5 = deq.peekLast();
				}
				System.out.println(val5);
				break;
			}

		}
	}
}

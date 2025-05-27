import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int[] arr= new int[num];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<num;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(answer(arr));
		
		
	}
	
	static String answer(int[] arr) {
		
		int ans = 1; //받은사람
		
		Stack<Integer> stack = new Stack<Integer>();
		for (int i=0;i<arr.length;i++) {
			if(arr[i] != ans) {
				if(!stack.isEmpty() && stack.peek() == ans) {
					stack.pop();
					i--;
					ans++;
				} else {
					stack.push(arr[i]);
				}
			} else {
				ans++;
			}
		}
		
		for(int i=0;i<stack.size();i++) {
			int val = stack.pop();
			if(val == ans) {
				ans++;;
			} else {
				return "Sad";
			}
			
		}

		return "Nice";
	}
	
	
}

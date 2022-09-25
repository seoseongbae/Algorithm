import java.util.*;

import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		String p = br.readLine();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Stack<Double> stack = new Stack<>();
		for (int i = 0; i < p.length(); i++) {
			char ch = p.charAt(i);
			if ('A' <= ch && ch <= 'Z') {
				double d = arr[ch - 'A'];
				stack.push(d);
			} else {
				double d1 = stack.pop();
				double d2 = stack.pop();
				double d3 = 0.0;
				switch (ch) {
				case '+':
					d3 = d2 + d1;
					break;
				case '-':
					d3 = d2 - d1;
					break;
				case '*':
					d3 = d2 * d1;
					break;
				case '/':
					d3 = d2 / d1;
					break;
				}
				stack.push(d3);
			}
		}
		System.out.printf("%.2f",stack.pop());
	}

}

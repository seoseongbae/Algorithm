import java.util.*;

import java.io.*;
import java.math.*;

public class Main {
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			long sum = 0;
			for (int j = 0; j < n; j++) {
				for (int k = j; k < n; k++) {
					if (j != k) {
						sum += gcd(arr[j], arr[k]);
					}

				}
			}
			System.out.println(sum);
		}

	}
}

import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		boolean[] prime = new boolean[1000001];
		prime[0] = prime[1] = true;
		for (int i = 2; i * i <= prime.length; i++) {
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
		while (n != 0) {

			boolean ok = true;
			for (int i = 2; i <= n / 2; i++) {
				if (!prime[i] && !prime[n - i]) {
					System.out.println(n + " = " + i + " + " + (n - i));
					ok = false;
					break;
				}
			}
			if (ok == true) {
				System.out.println("Goldbach's conjecture is wrong.");
			}
			n = Integer.parseInt(br.readLine());
		}
	}
}

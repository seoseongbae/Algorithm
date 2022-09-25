import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		get_prime();
		
		int n=sc.nextInt();
		
		while (n-- > 0) {
			int s = sc.nextInt();
			int first_partition = s / 2;
			int second_partition = s / 2;
 
			while (true) {
            
				if (!prime[first_partition] && !prime[second_partition]) {
					System.out.println(first_partition + " " + second_partition);
					break;
				}
				first_partition--;
				second_partition++;
			}
		}
		
	}
	public static void get_prime() {
		prime[0] = prime[1] = true;
 
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}

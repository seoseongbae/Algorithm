import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) 
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		int gcdVal=arr[1]-arr[0];
		for(int i=2;i<n;i++)
		{
			gcdVal=gcd(gcdVal,arr[i]-arr[i-1]);
		}
		for(int i=2;i<=gcdVal;i++)
		{
			if(gcdVal % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}

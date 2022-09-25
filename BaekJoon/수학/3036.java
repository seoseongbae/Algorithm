import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		 
		int n=sc.nextInt();
		
		int f=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			int o=sc.nextInt();
			int gcd=gcd(f,o);
			System.out.println((f/gcd)+"/"+(o/gcd));
		}
		
	}
	static int gcd(int a, int b) {
		int r;
 
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}

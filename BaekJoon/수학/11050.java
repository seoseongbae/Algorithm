import java.util.*;

import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		System.out.println(fac(n)/(fac(n-k)*fac(k)));
	}
	static int fac(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		return n*fac(n-1);
	}
}

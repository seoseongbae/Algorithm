import java.util.*;

import java.io.*;
import java.math.*;

public class Main {
	public static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcd= gcd(a,b);
		int lcm= (a*b)/gcd;
		System.out.println(gcd);
		System.out.println(lcm);
	}
	
}
/* 5 8 */

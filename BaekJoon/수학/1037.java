import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(n-- > 0) {
			int t = sc.nextInt();

			 if(t > max) max = t;
			 if(t < min) min = t;
			
		}
		System.out.println(max * min);
	}
}

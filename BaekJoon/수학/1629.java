import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	
	public static long c;
	public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(System.in);
	    
	     long a =sc.nextLong();
	     long b =sc.nextLong();
	     c=sc.nextLong();
	     
	    System.out.println(pow(a,b));
	    
	}
	public static long pow(long a, long exp) {
		if(exp==1)
		{
			return a%c;
		}
		long temp = pow(a,exp/2);
		if(exp%2==1)
		{
			return(temp*temp%c)*a%c;
		}
		return temp*temp%c;
	}
}

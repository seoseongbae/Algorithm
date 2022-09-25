import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int a=3;
		int b=5;
		
		if(n==4||n==7) {
			System.out.println(-1);
		}
		else if(n%5==0)
		{
			System.out.println(n/5);
		}
		else if(n%5==1||n%5==3)
		{
			System.out.println((n/5)+1);
		}
		else if(n%5==2||n%5==4)
		{
			System.out.println((n/5)+2);
		}
		
		
	}
}

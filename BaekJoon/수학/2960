import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static boolean[] prime;
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		prime=new boolean[n+1];
		int count=0;
		for(int i=2;i<=n;i++)
		{
			for(int j=i;j<=n;j+=i)
			{
				if(prime[j]==false) {
					count++;
					prime[j]=true;
				}
				if(count==k)
				{
					System.out.println(j);
					System.exit(0);
				}
			}
			
		}
		
		
		
	}
	
}


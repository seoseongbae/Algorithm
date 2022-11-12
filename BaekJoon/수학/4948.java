import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static boolean[] prime=new boolean[1000001];
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		get_prime();
		while(true)
		{
			int n=sc.nextInt();
			if(n==0)
			{
				break;
			}
			int count=0;
			for(int i=n+1;i<=2*n;i++)
			{
				if(!prime[i])
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}
	public static void get_prime()
	{
		prime[0]=prime[1]=true;
		for(int i=2;i*i<=prime.length;i++)
		{
			for(int j=i*i;j<prime.length;j+=i)
			{
				prime[j]=true;
			}
		}
	}
}


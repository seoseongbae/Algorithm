에라토스테네스의 체 라는 공식을 이용하여 푸는 문제이다


import java.util.*;
import java.io.*;

public class Main {
	public static boolean[] prime;
	public static void main(String[] args)throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int m=sc.nextInt();
		int n=sc.nextInt();
		prime = new boolean[n+1];
		get_prime();
		for(int i=m;i<=n;i++)
		{
			if(prime[i]==false)
			System.out.println(i);
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


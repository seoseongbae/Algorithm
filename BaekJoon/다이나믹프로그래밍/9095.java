import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int dp[]=new int[11];
		int t=Integer.parseInt(br.readLine());
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		
		for(int i=4;i<=10;i++)
		{
			dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
		}
		for(int i=0;i<t;i++)
		{
			int n=Integer.parseInt(br.readLine());
			System.out.println(dp[n]);
		}
	}
	
}


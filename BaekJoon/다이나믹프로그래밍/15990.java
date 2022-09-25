import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		
		long dp[][]=new long[100001][4];
		int t =Integer.parseInt(br.readLine());
		dp[1][1]=1;
		dp[2][2]=1;
		dp[3][1]=1;
		dp[3][2]=1;
		dp[3][3]=1;
		
		for(int i=4;i<dp.length;i++)
		{
			dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % 1000000009;
			dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % 1000000009;
			dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % 1000000009;
		}
		for(int i=0;i<t;i++)
		{
			int n=Integer.parseInt(br.readLine());
			long res=(dp[n][1]+dp[n][2]+dp[n][3])%1000000009;
			System.out.println(res);
		}
	}
}


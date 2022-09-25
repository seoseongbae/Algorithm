import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[][] dp = new int[30][30];
		
		
		for(int i=0;i<30;i++)
		{
			dp[i][i]=1;
			dp[i][0]=1;
		}
		for (int i = 2; i < 30; i++) {
			for (int j = 1; j < 30; j++) {
				
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
		}
		int t=sc.nextInt();
		StringBuilder sb = new StringBuilder();
        
		for(int i = 0; i < t; i++) {
 
			
			int N = sc.nextInt();	// N = r
			int M = sc.nextInt();	// M = n
			
			sb.append(dp[M][N]).append('\n');
		}
		
		System.out.println(sb);
	}

}

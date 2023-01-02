import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

   public static void main(String[] args) throws IOException {
      Scanner sc=new Scanner(System.in);
	  int A=sc.nextInt();
	  int[] arr=new int[A];
	  int[] dp = new int[A];
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  for(int i=0;i<A;i++)
	  {
		  dp[i]=1;
		  for(int j=0;j<i;j++)
		  {
			  if(arr[j]<arr[i]&&dp[i]<dp[j]+1)
			  {
				  dp[i]=dp[j]+1;
			  }
		  }
	  }
	  int max=-1;
	  for(int i=0;i<A;i++)
	  {
		  max=dp[i]>max?dp[i]:max;
	  }
	  System.out.println(max);
   }

}

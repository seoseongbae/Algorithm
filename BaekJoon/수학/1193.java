import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int count=0,sum=0;
		
		while(true)
		{
			if(n<=sum+count)
			{
				if(count%2==1) {
					System.out.println((count-(n-sum-1))+"/"+(n-sum));
					break;
				}
				else {
					System.out.println((n-sum)+"/"+(count-(n-sum-1)));
					break;
				}
			}
			else {
				sum+=count;
				count++;
			}
		}
	}
}

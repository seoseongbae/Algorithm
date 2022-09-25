import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		int [] arr=new int[n];
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--)
		{
			if(arr[i]<=k) {
				count+=(k/arr[i]);
				k=k%arr[i];
			}
		}
			
		System.out.println(count);
	}
}

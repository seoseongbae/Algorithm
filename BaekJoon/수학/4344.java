import java.util.*;
import java.io.*;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		int[] a;
		for(int i=0;i<c;i++)
		{
			int n=scanner.nextInt();
			a=new int[n];
			double sum=0;
			for(int j=0;j<n;j++)
			{
				a[j]=scanner.nextInt();
				sum+=a[j];
				
			}
			double mean =sum/n;
			double count =0;
			for(int k=0;k<n;k++)
			{
				if(mean<a[k])
				{
					count++;
				}
			}
			System.out.printf("%.3f%%\n",count/n*100);
		}
	}
}

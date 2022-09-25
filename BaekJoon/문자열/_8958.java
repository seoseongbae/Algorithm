import java.util.*;
import java.io.*;
import java.util.NoSuchElementException;
 
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] a =new String[scanner.nextInt()];
		
		for (int i = 0; i < a.length; i++) {
			a[i] =scanner.next();
			
		}
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			int sum=0;
			for(int j=0;j<a[i].length();j++)
			{
				if(a[i].charAt(j)=='O')
				{
					cnt++;
				}
				else cnt=0;
				sum+=cnt;
			}
			System.out.println(sum);
		}
		
	}
}

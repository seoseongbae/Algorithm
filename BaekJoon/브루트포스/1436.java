import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num=666;
		int count=1;
		
		while(count!=n)
		{
			num++;
			if(String.valueOf(num).contains("666"))
			{
				count++;
			}
		}
		System.out.println(num);
	
	}
}

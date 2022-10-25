import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static boolean[] prime;
	public static void main(String[] args)throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		int count=0;
		while(num>=5)
		{
			count+=num/5;
			num/=5;
		}
		System.out.println(count);
	}
}


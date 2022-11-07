import java.util.*;
import java.io.*;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		String b=scanner.next();
		int sum=0;
		for(int i=0;i<a;i++)
		{
			sum+=Integer.parseInt(b.substring(i,i+1));
		}
		System.out.println(sum);
	}
	
}

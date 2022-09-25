import java.util.*;
import java.io.*;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=0,b=0,n=0;
	
		while(scanner.hasNextInt())
		{
			
			a=scanner.nextInt();
			b=scanner.nextInt();
			System.out.println(a+b);
			
		}
		scanner.close();
	}
}

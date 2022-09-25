import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=0,b=0;
		while(true)
		{
			a=scanner.nextInt();
			b=scanner.nextInt();
			if(a==0&&b==0)
			{
				 break;
			}
			System.out.println(a+b);
			
		}
	}
}

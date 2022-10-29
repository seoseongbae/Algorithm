import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count=0;
		
		for (int i = 0; i < n; i++) 
		{
			boolean isPrime = true;

			int num = sc.nextInt();
			
			if (num <= 1)
			{
				continue;
			}
			if(num==2)
			{
				count++;
				continue;
			}

			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					isPrime=false;
				}
			}
			if(isPrime)
			{
				count++;
			}

		}
		System.out.println(count);
	}
}

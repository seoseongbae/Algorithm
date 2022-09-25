import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		 
		int x=sc.nextInt();
		int count=0;
		int stick=64;
		
		while(x>0) {
			if(stick>x)stick/=2;
			else {
				count++;
				x-=stick;
			}
		}
		System.out.println(count);
	}
	
}

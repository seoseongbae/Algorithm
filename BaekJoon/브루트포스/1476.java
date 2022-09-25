import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int e =sc.nextInt();
		int s=sc.nextInt();
		int m=sc.nextInt();
		int E=0;
		int S=0;
		int M=0;
		int year=0;
		while(true)
		{
			year++;
			E++;
			S++;
			M++;
			if(E>15)
			{
				E=1;
			}
			if(S>28)
			{
				S=1;
			}
			if(M>19)
			{
				M=1;
			}
			if(e==E && m==M&&S==s)
			{
				break;
			}
		}
		System.out.println(year);
		
	}
}

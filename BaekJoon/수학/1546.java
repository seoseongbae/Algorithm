import java.util.*;
import java.io.*;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double sum = 0;
		double[] a =new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		double max = a[0];
		for (int i = 1; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			sum+=(a[i]/max)*100;
		}
		System.out.println(sum/n);
	}
}

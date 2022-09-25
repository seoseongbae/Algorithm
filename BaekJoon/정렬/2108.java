import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] crr = new int[8888];
		int count = 0, count1 = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			avg += arr[i]; // 평균
		}
		int max = arr[0], min = arr[0];
		int max1 = 0;
		for (int i = 0; i < arr.length; i++) // 최대 최소
		{
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			crr[arr[i] + 4000]++;
		}
		for (int i = min + 4000; i <= max + 4000; i++) {
			if (crr[i] > max1) {
				max1 = crr[i];

			}
		}
		boolean bl = false;
		for (int i = min + 4000; i <= max + 4000; i++) {
			
			
			if (max1 == crr[i]) 
			{
				
				if (bl != true) {
					bl = true;
					count=i;
				}
				
				else if(bl==true)
				{
					count=i;
					break;
				}
					
			}

		}
		int center = arr.length / 2; // 중앙값
		Arrays.sort(arr);
		System.out.println(Math.round(avg / n));
		System.out.println(arr[center]);
		System.out.println(count-4000);
		System.out.println(max - min);

	}
}

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	
	
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int m=sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			
			// 찾고자 하는 값이 있을 경우 1, 없을 경우 0을 출력해야한다.
			if(binarySearch(arr, sc.nextInt()) >= 0) {
				sb.append(1).append('\n');
			}
			else {
				sb.append(0).append('\n');
			}
		}
		System.out.println(sb);
	}
	public static int binarySearch(int[] arr, int key) {
		 
		int lo = 0;					
		int hi = arr.length - 1;
 
		
		while(lo <= hi) {
 
			int mid = (lo + hi) / 2;	
 
			
			if(key < arr[mid]) {
				hi = mid - 1;
			}
			
			else if(key > arr[mid]) {
				lo = mid + 1;
			}
			
			else {
				return mid;
			}
		}
 
		
		return -1;
 
	}
}
---------------------------------------------------------------------
#다시 풀어본 문제
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); 
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<m;i++) {
			int num = Integer.parseInt(st.nextToken());

            int val = Arrays.binarySearch(arr, num);

            if (val < 0) {
                sb.append(0 + "\n");
            } else {
                sb.append(1 + "\n");
            }
			
		}
		
		System.out.println(sb.toString());
		
	}
}

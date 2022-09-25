import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
 
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
 
        Integer[] brr = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            brr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(brr, Comparator.reverseOrder()); 
        int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i]*brr[i];
		}
		System.out.println(sum);
	}
}

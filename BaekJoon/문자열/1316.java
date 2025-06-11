import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			String str=sc.next();
			boolean check[]=new boolean[26];
			boolean tmp=true;
			for(int j=0;j<str.length();j++)
			{
				int index=str.charAt(j)-'a';
				if(check[index]) {
					if(str.charAt(j)!=str.charAt(j-1))
					{
						tmp=false;
						break;
					}
				}
				else {
					check[index]=true;
				}
			}
			if(tmp) count++;
		}
		System.out.println(count);
	}
}
-------------------------------------------------------------------------
#다시 푼 문제
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			String S = br.readLine();
			boolean check[] = new boolean[26]; 
			boolean tmp = true;
			
			for (int j = 0; j < S.length(); j++) {
				int index = S.charAt(j)-'a';
				if(check[index]) {
					if(S.charAt(j) != S.charAt(j-1)) {
						tmp = false;
						break;
					}
				}else {
					check[index] = true;
				}
			}
			if(tmp) cnt++;
		}
		
		System.out.println(cnt);
		
		
	}
	
}

import java.util.*;
import java.io.*;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a=new int[26];
		for(int i=0;i<a.length;i++)
		{
			a[i]=-1;
		}
		String b=scanner.nextLine();
		for(int i=0;i<b.length();i++)
		{
			char ch=b.charAt(i);
			
			if(a[ch-'a']==-1)
			{
				a[ch-'a']=i;
			}
			
		}
		for(int i:a)
		{
			System.out.print(i + " ");
		}
	}
}

-------------------------------------
다시푼 문제

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [26];
		Arrays.fill(arr, -1); //배열을 -1로 초기화
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			int num = s.charAt(i) - 97;
			if (arr[num] == -1) {
				arr[num] = i;
			}
		}
		for(int val : arr) {	// 배열 출력
			System.out.print(val + " ");
		}
	}
}

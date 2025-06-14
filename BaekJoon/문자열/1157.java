import java.util.*;
import java.io.*;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] c = new int[26];
		String a = scanner.next();

		for (int i = 0; i < a.length(); i++) {
			if ('A' <= a.charAt(i) && a.charAt(i) <= 'Z') {
				c[a.charAt(i) - 'A']++;
			} 
			else {
				c[a.charAt(i) - 'a']++;
			}
		}
		int max = -1;
		char ch = '?';
		for (int i = 0; i <26; i++) {
			if (c[i] > max) {
				max = c[i];
				ch = (char) (i + 65);
			} else if (c[i] == max) {
				ch = '?';
			}
		}

		System.out.println(ch);
	}
}
--------------------------------------------------------------------------
#다시 푼 문제
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		s= s.toLowerCase();
		int[] arr = new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a'] +=1;
		}
		int max = -1;
		char ch = '?';
 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
	}
	
}

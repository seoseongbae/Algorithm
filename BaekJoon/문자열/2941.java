import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);

			if (ch == 'c') {
				if (i < a.length() - 1) {
					if (a.charAt(i + 1) == '=') {
						
						i++;
					} else if (a.charAt(i + 1) == '-') {
						i++;
					}
				}
			}

			else if (ch == 'd') {
				if (i < a.length() - 1) {
					if (a.charAt(i + 1) == 'z') {
						if (i < a.length() - 2) {
							if (a.charAt(i + 2) == '=') {
								i += 2;
							}
						}
					}

					else if (a.charAt(i + 1) == '-') {
						i++;
					}
				}
			}

			else if (ch == 'l') {
				if (i < a.length() - 1) {
					if (a.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}

			else if (ch == 'n') {
				if (i < a.length() - 1) {
					if (a.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}

			else if (ch == 's') {
				if (i < a.length() - 1) {
					if (a.charAt(i + 1) == '=') {
						i++;
					}
				}
			}

			else if (ch == 'z') {
				if (i < a.length() - 1) {
					if (a.charAt(i + 1) == '=') {
						i++;
					}
				}
			}
			count++;
		}
		System.out.println(count);
	}

}
----------------------------------------------------------------------
#다시 푼 문제
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] str = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0;i<str.length;i++) {
			if(s.contains(str[i])) {
				s=s.replace(str[i], "@");
			}
		}

		System.out.println(s.length());
		
	}
	
}

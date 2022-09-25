import java.util.*;

import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		
		String input;
		while ((input = br.readLine()) != null ) {
			 
            int[] arr = new int[4];
            sb=new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
 
                if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                    arr[0] += 1;
                }
                if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                    arr[1] += 1;
                }
                if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                    arr[2] += 1;
                }
                if (input.charAt(i) == ' ') {
                    arr[3] += 1;
                }
 
            }
 
            for (int i : arr) {
                sb.append(i).append(" ");
            }
 
            System.out.println(sb);
        }
	}
}

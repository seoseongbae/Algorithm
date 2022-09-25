import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
		 Scanner sc =new Scanner(System.in);
	        
	      int n= sc.nextInt();
	      String[][] a=new String[n][2];
	      for(int i=0;i<n;i++)
	      {
	    	a[i][0]=sc.next();
	    	a[i][1]=sc.next();
	    	  
	      }
	      Arrays.sort(a, new Comparator<String[]>() {
				// 나이순으로 정렬

				public int compare(String[] s1, String[] s2) {
					return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
				}
				
			});
	      for(int i = 0; i < n; i++) {
				System.out.println(a[i][0] + " " + a[i][1]);
			}
	}
}

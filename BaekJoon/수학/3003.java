import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int [] arr= {1,1,2,2,2,8}; //체스 갯수
		
		String[] s = br.readLine().split(" ");
		for(int i=0; i<s.length;i++) {
			sb.append((arr[i]-Integer.parseInt(s[i]))+" ");
		}
		
		System.out.println(sb.toString());
	}
}

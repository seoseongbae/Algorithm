import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String size = br.readLine();
		String[] arr = size.split(" ");
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		int sum=0;
		for (String s : arr) {
			if(Integer.parseInt(s)%t==0) {
				sum += Integer.parseInt(s)/t;
			} else {
				sum += Integer.parseInt(s)/t + 1;
			}
		}
		System.out.println(sum);
		System.out.println(n/p + " " + n%p);
		
	}

}

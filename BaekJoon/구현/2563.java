import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[100][100];
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j=x;j<x+10;j++) {
				for(int k=y;k<y+10;k++) {
					arr[j][k] = 1;
				}
			}
		}
		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}

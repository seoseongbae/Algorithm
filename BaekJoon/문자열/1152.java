import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(a," ");
		System.out.println(st.countTokens());
	}
}
StringTokenizer 사용 

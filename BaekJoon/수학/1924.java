import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int x=sc.nextInt();
		int y=sc.nextInt();
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] dayOfTheWeeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int totalDays = y;
		for (int i = 0; i < x - 1; ++i) {
			totalDays += daysInMonth[i];
		}
		
		System.out.println(dayOfTheWeeks[totalDays % 7]);
	}

}

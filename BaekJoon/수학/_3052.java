import java.util.*;
import java.io.*;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			h.add(scanner.nextInt() % 42);
		}
        
		System.out.print(h.size());
	}
}

hashset은 다른원소들을 넣는것 같은 원소는 못들어감

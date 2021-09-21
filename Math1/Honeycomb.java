package Math1;
import java.util.Scanner;

public class Honeycomb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dest = sc.nextInt();
		int limit = 1;
		int i = 1;

		while (limit < dest) {
			limit += (6 * i++);
		}
		System.out.println(i);
	}

}

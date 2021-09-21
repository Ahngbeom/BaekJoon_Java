package Math1;
import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		System.out.println((v - a) / (a - b) * (a - b) + a < v ? (v - a) / (a - b) + 2 : (v - a) / (a - b) + 1);
		
		long end = System.currentTimeMillis();
		System.out.println("수행시간: " + (double)((end - start) / 10000.0) + " ms");
	}

}

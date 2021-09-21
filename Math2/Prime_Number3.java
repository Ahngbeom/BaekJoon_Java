package Math2;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime_Number3 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		if (m == 1)
			m++;
		while (m <= n) {
			int i = 2;
			while (i <= Math.sqrt(m)) {
				if (m % i == 0)
					break;
				i++;
			}
			if (i > Math.sqrt(m)) {
				System.out.println(m);
			}
			m++;
		}

		long end = System.currentTimeMillis();
		System.out.println("수행시간: " + (double) ((end - start) / 1000.0) + " sec");
	}
}

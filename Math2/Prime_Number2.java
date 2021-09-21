package Math2;

import java.util.Scanner;

public class Prime_Number2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		sc.close();
		
		int min = -1;
		int sum = 0;

		while (m <= n) {
			int i = 2;
			while (i < m) {
				if (m % i != 0) {
					i++;
				} else {
					break;
				}
			}
			if (i == m) {
				System.out.println();
				if (min == -1)
					min = m;
				sum += min;
			}
			m++;
		}
		
		if (min == -1) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}

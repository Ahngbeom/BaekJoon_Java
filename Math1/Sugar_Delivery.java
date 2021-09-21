package Math1;

import java.util.Scanner;

public class Sugar_Delivery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int min = -1;
		int i = 0;
		while (5 * i <= n) {
			int j = 0;
			while (5 * i + 3 * j < n) {
				j++;
			}
			if (5 * i + 3 * j == n) {
				if (min == -1 || min > i + j)
					min = i + j;
			}
			i++;
		}
		System.out.println(min);
		sc.close();
	}
}

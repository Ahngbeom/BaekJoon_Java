package Phase09_Math2;

import java.util.Scanner;

public class Prime_Factorization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int i = 0;
		while (n > 1) {
			i = 2;
			while (i < n) {
				if (n % i == 0) {
					n /= i;
					System.out.println(i);
					break;
				}
				i++;
			}
			if (i == n) {
				System.out.println(n);
				break;
			}
		}
	}
}

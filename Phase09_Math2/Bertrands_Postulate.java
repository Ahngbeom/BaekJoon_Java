package Phase09_Math2;

import java.util.Scanner;

public class Bertrands_Postulate {

	public int isPrime(int num) {
		int i = 2;
		
		while (i <= Math.sqrt(num)) {
			if (num % i == 0)
				break;
			i++;
		}
		if (i > Math.sqrt(num)) {
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Bertrands_Postulate bp = new Bertrands_Postulate();
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			
			if (n == 0)
				break;
			int i = n + 1;
			int count = 0;
			while (i <= 2 * n) {
				count += bp.isPrime(i++);
			}
			System.out.println(count);
		}
		sc.close();
	}

}

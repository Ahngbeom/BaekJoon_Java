package Math2;

import java.util.ArrayList;
import java.util.Scanner;

public class Goldbach {

	public boolean isPrime(int num) {
		int i = 2;

		if (num == 2)
			return true;

		while (i <= Math.sqrt(num)) {
			if (num % i == 0)
				break;
			i++;
		}
		if (i > Math.sqrt(num)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		Goldbach g = new Goldbach();
		Scanner sc = new Scanner(System.in);

		int iter = sc.nextInt();

		ArrayList<Integer> prime = new ArrayList<Integer>();
		prime.add(2);
		
		while (iter-- > 0) {
//			long start = System.currentTimeMillis();
			int n = sc.nextInt();

			int i = 3;
			while (i < n && prime.get(prime.size() - 1) < n) {
				if (prime.contains(i) == false && g.isPrime(i) == true)
					prime.add(i);
				i++;
			}
			
//			System.out.println(prime);

			int a = prime.get(0);
			int b = prime.get(0);
			i = 0;
			int j = 0;
			while (i < prime.size() - 1) {
				j = i;
				if (prime.get(i) + prime.get(j) > n) 
					break;
				while (j < prime.size() && prime.get(i) + prime.get(j) <= n) {
					if (prime.get(i) + prime.get(j) > n) 
						break;
//					System.out.println("compare " + prime.get(i) + " " + prime.get(j));
					if (prime.get(i) + prime.get(j) == n) {
						a = prime.get(i);
						b = prime.get(j);
					}
					j++;
				}
				i++;
			}
			System.out.println(a + " " + b);
//			long end = System.currentTimeMillis();
//			System.out.println("수행시간: " + (double) ((end - start) / 1000.0) + " sec");
		}
		
	}

}

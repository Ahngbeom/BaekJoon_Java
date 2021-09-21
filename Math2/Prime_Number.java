package Math2;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iter = sc.nextInt();
		int count = 0;
		
		while (iter-- > 0) {
			int num = sc.nextInt();
			int i = 2;
			while (i < num) {
				if (num % i == 0) {
					break;
				} else {
					i++;
				}
			}
			if (i == num) {
				count++;
			}
		}
		System.out.println(count);
	}

}

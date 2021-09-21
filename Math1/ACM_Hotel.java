package Math1;

import java.util.Scanner;

public class ACM_Hotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		while (test_case-- > 0)
		{
			int h = sc.nextInt();
			// int w = sc.nextInt();
			sc.nextInt();
			int n = sc.nextInt();
			
			if (h <= n) {
				if (n % h != 0)
					System.out.println(((n % h) * 100) + (n / h + 1));
				else
					System.out.println(h * 100 + (n / h));
			}
			else
				System.out.println((n * 100) + 1);
		}
		sc.close();
	}
}

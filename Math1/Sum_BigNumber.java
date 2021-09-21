package Math1;

import java.util.Scanner;

public class Sum_BigNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		if (a.length() != b.length()) {
			if (a.length() > b.length()) {
				while (b.length() < a.length())
					b = String.join("", "0", b);
			} else {
				while (a.length() < b.length())
					a = String.join("", "0", a);
			}
		}
		
		String result = new String();
		
		int carry = 0;
		while (a.length() != 0 || b.length() != 0) {
			// Least Significant Number
			int a_LSN = a.charAt(a.length() - 1) - 48;
			int b_LSN = b.charAt(b.length() - 1) - 48;
			if (a_LSN + b_LSN + carry >= 10) {
				result = String.join("", Integer.toString((a_LSN + b_LSN + carry) % 10), result);
				carry = 1;
			} else {
				result = String.join("", Integer.toString(a_LSN + b_LSN + carry), result);
				carry = 0;
			}
			a = a.substring(0, a.length() - 1);
			b = b.substring(0, b.length() - 1);
		}
		if (carry == 1) {
			result = String.join("", "1", result);
		}
		System.out.println(result);
		sc.close();
	}
}

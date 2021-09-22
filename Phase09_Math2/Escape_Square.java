package Phase09_Math2;

import java.util.Scanner;

public class Escape_Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a_x = sc.nextInt();
		int a_y = sc.nextInt();
		int b_x = sc.nextInt();
		int b_y = sc.nextInt();
		int c_x = sc.nextInt();
		int c_y = sc.nextInt();
		sc.close();
		
		if (a_x == b_x) {
			System.out.print(c_x + " ");
		} else if (a_x == c_x) {
			System.out.print(b_x + " ");
		} else {
			System.out.print(a_x + " ");
		}
		
		if (a_y == b_y) {
			System.out.println(c_y);
		} else if (a_y == c_y) {
			System.out.println(b_y);
		} else {
			System.out.println(a_y);
		}
		
	}

}

package Phase08_Math1;
import java.util.Scanner;

public class Break_Even_Point {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (b >= c) {
			System.out.println(-1);
		} else {
			System.out.println(Math.abs(a / (b - c)) + 1);
		}
		sc.close();
	}
}

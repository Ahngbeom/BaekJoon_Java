package Math2;

import java.util.Scanner;

public class Turret {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iter = sc.nextInt();
		
		while (iter-- > 0) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			double distance = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));
			double dist_r = r2 < r1 ? r1 - r2 : r2 - r1;
			
			if (x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
			} else if (distance > dist_r && distance < r1 + r2) {
				System.out.println(2);
			} else if (dist_r == distance || r1 + r2 == distance) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}

}

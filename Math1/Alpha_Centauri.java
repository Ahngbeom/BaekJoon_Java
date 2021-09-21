package Math1;
import java.util.Scanner;

public class Alpha_Centauri {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iter = sc.nextInt();
		
		while (iter-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int move_range = 1;
			
			int first_point = x;
			int last_point = y;
			int count = 0;
			
			while (first_point < y) {
//				System.out.println(first_point + " + " + move_range + " => " + (first_point + move_range) + "  " + last_point + " - " + move_range + " => " + (last_point - move_range));
				if (first_point < last_point) {
					first_point += move_range;
					if (first_point >= last_point) {
						count++;
						break;
					} else {
						last_point -= move_range;
						move_range++;
						count += 2;
					}
				}
				else
					break;
			}
			System.out.println(count);
		}
	}
}

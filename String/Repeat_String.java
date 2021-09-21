package String;
import java.util.Scanner;

public class Repeat_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		String[] word = new String[test_case];
		int[] repeat = new int[test_case];
		int i = 0, j, k;

		while (i < test_case) {
			repeat[i] = sc.nextInt();
			word[i] = sc.next();
			i++;
		}

		i = 0;
		while (i < test_case) {
			j = 0;
			while (j < word[i].length()) {
				k = 0;
				while (k++ < repeat[i]) {
					System.out.print(word[i].charAt(j));
				}
				j++;
			}
			i++;
			System.out.println();
		}
	}
}

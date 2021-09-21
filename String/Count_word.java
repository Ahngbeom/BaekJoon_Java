package String;
import java.util.Scanner;

public class Count_word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.split(" ");
		
		int count = 0;
		for (String w : words) {
			if (!w.isEmpty())
				count++;
		}
		System.out.println(count);
	}
}

package String;
import java.util.Scanner;

public class Dial_time {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		sc.close();
		int time = 0;
		int subtrahend = 59;
		
		int i = 0;
		while (i < word.length()) {
			if (word.charAt(i) >= 'S' && word.charAt(i) != 'Z')
				subtrahend = 60;
			else if (word.charAt(i) == 'Z')
				subtrahend = 61;
			else 
				subtrahend = 59;
			time += (int)(word.charAt(i++) - subtrahend) / 3 + 1;
		}
		System.out.print(time);
	}
}

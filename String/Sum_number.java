package String;
import java.util.Scanner;

public class Sum_number {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String str_numbers = sc.next();
		int result = 0;
		
		while (count-- > 0)
		{
			result += str_numbers.charAt(count) - 48;
		}
		System.out.println(result);
		sc.close();
	}
}

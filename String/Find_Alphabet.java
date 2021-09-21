package String;
import java.util.Scanner;

public class Find_Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		sc.close();
		int	i = 0;
		char alpha = 'a';
		
		while (alpha <= 'z')
		{
			i = 0;
			while (i < word.length())
			{
				if (alpha == word.charAt(i))
				{
					System.out.print(i + " ");
					break;
				}
				i++;
			}
			if (i >= word.length())
				System.out.print(-1 + " ");
			alpha++;
		}
		
	}

}

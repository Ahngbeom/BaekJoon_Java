package Phase07_String;
import java.util.Scanner;

public class Croatia_Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		sc.close();
		String[] croatia_alpha = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String[] temp;
		
		int used = 0;
		int i = 0;
		while (i < croatia_alpha.length) {
			while (msg.contains(croatia_alpha[i]))
			{
				temp = msg.split(croatia_alpha[i], 2);
				if (temp.length == 0)
					used = msg.length() / croatia_alpha[i].length();
				else 
					used++;
				msg = String.join(",", temp);
			}
			i++;
		}
		temp = msg.split(",");
		msg = String.join("", temp);
		System.out.println(msg.length() + used);
	}
}

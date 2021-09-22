package Phase07_String;
import java.util.ArrayList;
import java.util.Scanner;

public class Group_word {

	public boolean dupl_check(ArrayList<Character> al, char c) {
		int i = 0;

		while (i < al.size()) {
			if (c == al.get(i))
				return true;
			i++;
		}
		return false;
	}

	public static void main(String[] args) {
		Group_word gw = new Group_word();
		
		Scanner sc = new Scanner(System.in);
		
		int repeat = sc.nextInt();
		String[] word = new String[repeat];
		
		ArrayList<Character> used = new ArrayList<Character>();
		
		int gw_cnt;
		boolean check;
		int i;
		
		gw_cnt = 0;
		i = 0;
		while (i < repeat) {
			word[i] = sc.next();
			check = true;
			int j = 0;
			while (j < word[i].length()) {
				if (!gw.dupl_check(used, word[i].charAt(j))) {
					used.add(word[i].charAt(j));
					j++;
				} else if (used.get(used.size() - 1) == word[i].charAt(j))
					j++;
				else {
					check = false;
					break;
				}
			}
			if (check == true) {
				gw_cnt++;
			}
			used.clear();
			i++;
		}
		
		System.out.println(gw_cnt);
		sc.close();
	}
}

package String;
import java.util.ArrayList;
import java.util.Scanner;

public class Most_used_alphabet {

	public ArrayList<Character> used_alphabet(String word) {
		ArrayList<Character> alpha = new ArrayList<>();
		int i = 0;
		boolean dupl_check;

		while (i < word.length()) {
			dupl_check = false;
			for (Character c : alpha) {
				if (Character.toUpperCase(word.charAt(i)) == c) {
					dupl_check = true;
					break;
				}
			}
			if (dupl_check == false)
				alpha.add(Character.toUpperCase(word.charAt(i)));
			i++;
		}
		return alpha;
	}

	public int[] used_count(ArrayList<Character> alphabets, String word) {
		int[] count = new int[alphabets.size()];
		int i = 0, j;

		while (i < alphabets.size()) {
			j = 0;
			while (j < word.length()) {
				if (alphabets.get(i) == Character.toUpperCase(word.charAt(j)))
					count[i]++;
				j++;
			}
			i++;
		}
		return count;
	}

	public int used_max(int[] used_count) {
		int i = 1;
		int max_idx = 0;
		while (i < used_count.length) {
			if (used_count[max_idx] < used_count[i])
				max_idx = i;
			i++;
		}
		return max_idx;
	}

	public boolean duplicate_check(int[] count, int index)
	{
		int i = 0;
		boolean dupl_check = false;
		
		while (i < count.length) {
			if (count[index] == count[i] && index != i) {
				dupl_check = true;
				break;
			}
			i++;
		}
		
		return dupl_check;
	}
	
	public static void main(String[] args) {
		Most_used_alphabet mua = new Most_used_alphabet();
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		ArrayList<Character> used = mua.used_alphabet(word);
		
		int[] count = mua.used_count(used, word);
		
		int max_idx = mua.used_max(count);
		
		if (mua.duplicate_check(count, max_idx) == false)
			System.out.println(used.get(max_idx));
		else
			System.out.println("?");
	}
}

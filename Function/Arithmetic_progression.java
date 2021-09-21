package Function;
import java.util.ArrayList;
import java.util.Scanner;

public class Arithmetic_progression {
	
	public ArrayList<Integer> place_value(int num)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		int	n = num;
		
		while (n != 0)
		{
			if (n % 10 >= 0)
			{
				arr.add(n % 10);
			}
			n = n / 10;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Arithmetic_progression ap = new Arithmetic_progression();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> place;
		int limit = sc.nextInt();
		int	diff;
		int count = 0;
		int	i;
		
		while (limit > 0) {
			place = ap.place_value(limit);
			if (limit / 10 >= 1)
			{
				diff = place.get(0) - place.get(1);
				for (i = 1; i < place.size() - 1; i++) {
					if (diff == place.get(i) - place.get(i + 1))
						continue;
					else
						break;
				}
				if (i >= place.size() - 1)
					count++;
			}
			else
				count++;
			limit--;
		}
		System.out.println(count);
	}
}

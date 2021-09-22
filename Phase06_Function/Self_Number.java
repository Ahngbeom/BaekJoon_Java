package Phase06_Function;
import java.util.ArrayList;

public class Self_Number {
	
	public ArrayList<Integer> place_value(int num)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		int	n = num;
		
		while (n != 0)
		{
			if (n % 10 > 0)
			{
				arr.add(n % 10);
			}
			n = n / 10;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Self_Number sn = new Self_Number();
		ArrayList<Integer> place = new ArrayList<>();
		int num = 1;
		int temp = 0;
		int	check;
		
		while (num <= 10000)
		{
			check = 0;
			for (int n = num - 1; n > 0; n--)
			{
				place = sn.place_value(n);
				temp = n;
				for (int place_number : place) {
					temp += place_number;
				}
				if (num == temp)
				{
					check = 1;
					break;
				}
			}
			if (check == 0 )
				System.out.println(num);
			num++;
		}
	}
}

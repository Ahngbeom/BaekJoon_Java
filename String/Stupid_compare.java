package String;
import java.util.Scanner;

public class Stupid_compare {

	public int stupid_read(int num)
	{
		int temp = 0;
		while (num != 0)
		{
			if (temp > 0)
				temp *= 10;
			temp += num % 10;
			num /= 10;
		}
		num = temp;
		return temp;
	}
	
	public static void main(String[] args) {
		Stupid_compare stu = new Stupid_compare();
		Scanner sc = new Scanner(System.in);
		
		int num1 = stu.stupid_read(sc.nextInt());
		int num2 = stu.stupid_read(sc.nextInt());
		
		if (num1 > num2)
			System.out.println(num1);
		else
			System.out.println(num2);
		
		sc.close();
	}
}

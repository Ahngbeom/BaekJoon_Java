package Recursion;
import java.util.Scanner;

public class Fatorial {

	public int factorial(int num)
	{
		int n;

		n = num;
		if (n <= 1)
			return (1);
		n = n * factorial(--num);
		return (n);
	}
	
	public static void main(String[] args) {
		Fatorial rc = new Fatorial();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(rc.factorial(sc.nextInt()));
		sc.close();
	}

}

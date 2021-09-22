package Phase10_Recursion;
import java.util.Scanner;

public class Fibonacci {

	public int fibonacci(int n) {
		int result = 0;
		
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		result = fibonacci(n - 1) + fibonacci(n - 2);
		return result;
	}
	
	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		System.out.println(fibo.fibonacci(sc.nextInt()));
		sc.close();
	}

}

package Phase01_IO_Arithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int result = 0;
		int power = 0;
		
		while (b != 0) {
			System.out.println(a * (b % 10));
			result += a * (b % 10) * Math.pow(10, power++);
			b /= 10;
		}
		System.out.println(result);
	}

}

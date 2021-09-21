package Math1;
import java.util.Scanner;

public class Finding_Fraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long start = System.currentTimeMillis();
		
		int numerator = 1;
		int denominator = 1;
		
		int phase = 2;
		int phase_num = 0;
		int count = 1;
		while (true) {
			if (x == count)
				break;
			else {
				if (phase_num == phase) {
					phase++;
					phase_num = 0;
					continue;
				}
				
				if (phase_num == 0) { 
					if (phase % 2 == 0) {
						numerator = 1;
						denominator = phase;
						phase_num++;
					}
					else {
						numerator = phase;
						denominator = 1;
						phase_num++;
					}
				}
				else {
					if (phase % 2 == 0) {
						numerator += 1;
						denominator -= 1;
						phase_num++;
					}
					else {
						numerator -= 1;
						denominator += 1;
						phase_num++;
					}
				}
				count++;
			}
		}
		System.out.println(numerator + "/" + denominator);
		sc.close();
		long end = System.currentTimeMillis();
		System.out.println("수행시간 : " + (double)((end - start) / 10000.0) + " ms");
	}
}

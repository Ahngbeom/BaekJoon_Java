package Math2;
import java.util.Scanner;

public class Taxicap_Geometry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		sc.close();
		
		System.out.printf("%.6f\n", Math.pow(r, 2.0) * Math.PI);
		System.out.printf("%.6f\n", Math.pow(r, 2.0) * 2);
	}

}

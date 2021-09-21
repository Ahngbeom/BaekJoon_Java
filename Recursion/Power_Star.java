package Recursion;
import java.util.Scanner;

public class Power_Star {

	public void put_star(int row, int col, int n) {
		if (row == n)
			return ;
		
		if (row / (n / 3) == 1 && col / (n / 3) == 1)
			System.out.print(" ");
		else if (row % (n / 3) >= 3 && row % (n / 3) <= 5)
		{
			if (col % (n / 3) >= 3 && col % (n / 3) <= 5)
				System.out.print(" ");
			else
				System.out.print("*");
		}
		else if (row % 3 == 1 && col % 3 == 1)
			System.out.print(" ");
		else
			System.out.print("*");
		
		if (col + 1 == n)
		{
			System.out.println();
			row++;
			col = 0;
		}
		else
			col++;
		put_star(row, col, n);
	}

	public static void main(String[] args) {
		Power_Star ps = new Power_Star();
		Scanner sc = new Scanner(System.in);
//		int wh = sc.nextInt();
//		int[][] square = new int[wh][wh];
		
//		ps.put_star(0, 0, sc.nextInt());
		ps.put_star(0, 0, 3);
		ps.put_star(0, 0, 9);
		ps.put_star(0, 0, 27);
	}
}

package Math1;

import java.util.Scanner;

public class I_ll_be_chairman {

	public int Downstairs_sum(int[] arr, int limit_idx) {
		int result = 0;
		int i = 0;
		while (i <= limit_idx) {
			result += arr[i++];
		}
		return result;
	}
	
	public static void main(String[] args) {
		I_ll_be_chairman cm = new I_ll_be_chairman();
		Scanner sc = new Scanner(System.in);
		int	test_case = sc.nextInt();
		
		while (test_case-- > 0) {
			int	k = sc.nextInt();
			int n = sc.nextInt();
			int[][] arr = new int[k + 1][n];
			
			int i = 0;
			while (i < n) {
				arr[0][i] = ++i;
			}
			
			if (k > 0) {
				i = 1;
				while (i <= k) {
					int j = 0;
					while (j < n) {
						arr[i][j] = cm.Downstairs_sum(arr[i - 1], j);
						j++;
					}
					i++;
				}
			}
			System.out.println(arr[k][n - 1]);
		}
	}
}
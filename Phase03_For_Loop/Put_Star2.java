package Phase03_For_Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Put_Star2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int i = 1;
		while (i <= n) {
			int j = 0;
			
			while (j < (n - i)) {
				bw.write(" ");
				j++;
			}
			while (j < n) {
				bw.write("*");
				j++;
			}
			bw.newLine();
			i++;
		}
		bw.flush();
		bw.close();
	}

}

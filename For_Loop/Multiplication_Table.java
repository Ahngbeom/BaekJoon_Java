package For_Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Multiplication_Table {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int i = 0;
		
		while (++i <= 9) {
			bw.write(n + " * " + i + " = " + (n * i));
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}

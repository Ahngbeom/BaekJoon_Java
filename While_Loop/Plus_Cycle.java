package While_Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Plus_Cycle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String n = br.readLine();
		
		if (n.length() < 2) {
			n = String.join("", "0", n);
		}
		
		int cycle = 0;
		String new_n = n;
		while (true) {
			int digit_sum = new_n.charAt(0) - 48 + new_n.charAt(1) - 48;
			new_n = new_n.charAt(1) + Integer.toString(digit_sum % 10);
			if (new_n.length() < 2)
				new_n = String.join("", "0", new_n);
			cycle++;
			if (new_n.equals(n))
				break;
		}
		
		bw.write(Integer.toString(cycle));
		bw.newLine();
		bw.flush();
		bw.close();
	}

}

package Phase05_Array_1Dimension;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OX_Quiz {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int iter = Integer.parseInt(br.readLine());

		while (iter-- > 0) {
			String result = br.readLine();
			char[] arr = new char[result.length()];
			int i = 0;
			int total = 0;
			int point = 0;
			while (i < arr.length) {
				arr[i] = result.charAt(i);
				if (arr[i] == 'O')
					total += ++point;
				else
					point = 0;
				i++;
			}
			bw.write(Integer.toString(total));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}

package Phase05_Array_1Dimension;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Count_Number {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String multi_val = Integer.toString(Integer.parseInt(br.readLine()) * 
												Integer.parseInt(br.readLine()) * 
													Integer.parseInt(br.readLine()));
		
		int count[] = new int[10];

		int i = 0;
		while (i < multi_val.length()) {
			switch (multi_val.charAt(i)) {
				case '0':
					count[0]++;
					break;

				case '1':
					count[1]++;
					break;

				case '2':
					count[2]++;
					break;
				
				case '3':
					count[3]++;
					break;
			
				case '4':
					count[4]++;
					break;
				
				case '5':
					count[5]++;
					break;

				case '6':
					count[6]++;
					break;

				case '7':
					count[7]++;
					break;
				
				case '8':
					count[8]++;
					break;
			
				case '9':
					count[9]++;
					break;

				default:
					break;
			}
			i++;
		}
		for (int used : count) {
			bw.write(Integer.toString(used));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}

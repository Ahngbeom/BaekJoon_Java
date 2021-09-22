package Phase05_Array_1Dimension;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Maybe_above_Average {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int c = Integer.parseInt(br.readLine());

		while (c-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] score = new int[n];
			int i = 0;
			int sum = 0;
			while (st.hasMoreTokens()) {
				score[i] = Integer.parseInt(st.nextToken());
				sum += score[i++];
			}
			double avg = (double)sum / (double)score.length;
			double ratio = 0;
			for (int j : score) {
				if (j > avg)
					ratio += 100.0 / n;
			}
			bw.write(String.format("%.3f%%", Math.round(ratio * 1000) / (double)1000));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}

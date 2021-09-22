package Phase05_Array_1Dimension;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Average {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		double[] arr = new double[n];
		int i = 0;
		double max = 0;
		while (st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (i == 0)
				max = arr[i];
			else { 
				if (max < arr[i])
					max = arr[i];
			}
			i++;
		}

		i = 0;
		double sum = 0;
		while (i < arr.length) {
			arr[i] = arr[i] / max * 100.0;
			sum += arr[i];
			i++;
		}
		bw.write(Double.toString(sum / arr.length));
		bw.flush();
		bw.close();
	}
}

package Phase05_Array_1Dimension;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Min_and_Max {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		int i = 0;
		int min_idx = 0;
		int max_idx = 0;
		while (i < n) {
			arr[i] = Integer.parseInt(st.nextToken());
		
			if (arr[min_idx] > arr[i])
				min_idx = i;
			if (arr[max_idx] < arr[i])
				max_idx = i;
			
			i++;
		}
		bw.write(arr[min_idx] + " " + arr[max_idx]);
		bw.flush();
		bw.close();
	}

}

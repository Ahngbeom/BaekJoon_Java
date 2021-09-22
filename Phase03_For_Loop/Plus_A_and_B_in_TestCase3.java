package Phase03_For_Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Plus_A_and_B_in_TestCase3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int iter = Integer.parseInt(br.readLine());
		int i = 0;
		while (++i <= iter) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write("Case #" + i + ": " + Integer.toString(a) + " + " + Integer.toString(b) + " = " + Integer.toString(a + b));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

}

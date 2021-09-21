package For_Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Plus_A_and_B_in_TestCase2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int iter = Integer.parseInt(br.readLine());
		int i = 0;
		while (++i <= iter) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			bw.write("Case #" + i + ": "+ Integer.toString(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

}

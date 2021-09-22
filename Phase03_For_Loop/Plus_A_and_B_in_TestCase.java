package Phase03_For_Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Plus_A_and_B_in_TestCase {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int iter = Integer.parseInt(br.readLine());
		while (iter-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			bw.write(Integer.toString( Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) ));
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}

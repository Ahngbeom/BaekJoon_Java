package While_Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Plus_A_and_B_Infinity {

	public void Using_Scanner() {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a + b);
		}
	}
	
	public void Using_BufferedReader() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String r = "";
		
		while ((r = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(r);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(Integer.toString(a + b));
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	
	public static void main(String[] args) throws IOException {
		Plus_A_and_B_Infinity p = new Plus_A_and_B_Infinity();
//		p.Using_Scanner();
		p.Using_BufferedReader();
	}
}

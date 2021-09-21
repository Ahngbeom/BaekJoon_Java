package IF_Conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Grade {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int point = Integer.parseInt(st.nextToken());
		
		if (point >= 90) {
			System.out.println("A");
		} else if (point >= 80) {
			System.out.println("B");
		} else if (point >= 70) {
			System.out.println("C");
		} else if (point >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}

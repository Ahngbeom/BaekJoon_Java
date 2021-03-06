package Phase02_IF_Conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Alarm {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if (m < 45) {
			if (h == 0)
				h = 24 - 1;
			else 
				h--;
			m = 60 + (m - 45);
		} else {
			m -= 45;
		}
		
		System.out.println(h + " " + m);
	}

}

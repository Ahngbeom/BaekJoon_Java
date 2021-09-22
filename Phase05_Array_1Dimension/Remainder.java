package Phase05_Array_1Dimension;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Remainder {
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> al = new ArrayList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String read = new String();
		while ((read = br.readLine()) != null) {
			if (al.contains(Integer.parseInt(read) % 42) == false)
				al.add(Integer.parseInt(read) % 42);
		}
		bw.write(Integer.toString(al.size()));
		bw.flush();
		bw.close();
	}
}

package boj_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static final void main(String args[]) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);

			int max = 0;
			while (st.hasMoreTokens()) {
				StringBuilder sb = new StringBuilder(st.nextToken());
				sb.reverse();
				max = Math.max(max, Integer.parseInt(sb.toString()));
			}

			System.out.println(max);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

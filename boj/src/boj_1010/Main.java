package boj_1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int west, east;

		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);

			west = Integer.parseInt(st.nextToken());
			east = Integer.parseInt(st.nextToken());
			calculate_combination(west,east);
		}

	}

	private static void calculate_combination(int west, int east) {
		BigInteger top=BigInteger.valueOf(1);
		BigInteger bottom=BigInteger.valueOf(1);
		if(west==east) {
			System.out.println(1);
			return;
		}
			
		for (int j = east; j > east-west; j--)				
			top=top.multiply(BigInteger.valueOf(j));

		for (int j =west; j > 0; j--)
			bottom=bottom.multiply(BigInteger.valueOf(j));

		System.out.println(top.divide(bottom).intValue());
	}

}

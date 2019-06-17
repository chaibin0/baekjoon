package boj_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String N = br.readLine();
		int total=0;
		for (int i = 0; i < N.length(); i++)
			total+=N.charAt(i)-'0';
		System.out.println(total);

	}

}

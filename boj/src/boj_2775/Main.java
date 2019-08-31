package boj_2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			int T = Integer.parseInt(br.readLine());
			for (int i = 0; i < T; i++) {
				int a = Integer.parseInt(br.readLine());
				int b = Integer.parseInt(br.readLine());

				solve(a, b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void solve(int a, int b) {
		int[][] dp = new int[a + 1][b + 1];

		for (int i = 1; i <= b; i++) {
			dp[0][i] = i;
		}

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}

		System.out.println(dp[a][b]);
	}


}

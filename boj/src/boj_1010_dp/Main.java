package boj_1010_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int west = 0, east = 0;

		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);

			west = Integer.parseInt(st.nextToken());
			east = Integer.parseInt(st.nextToken());
			
			if(east==west) {
				System.out.println(1);
				continue;
			}
			if (east - west < west) // 조합 1차 변환
				west = east - west;

			
			int[][] dp = new int[west+1][east+1];
			
			for (int j = 1; j <= west; j++) {
				for (int k = j; k <= east; k++) {
					if (j == 1) {
						dp[j][k] = k;
						continue;
					}
					
					if (j == k)
						dp[j][k] = 1;
					else
						dp[j][k] = dp[j][k-1] + dp[j - 1][k - 1];
					
					}
			}
			
			System.out.println(dp[west][east]);
		}

	}

}

package boj_2293;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//µ¿Àü 1
public class Main {
	private static int[] money;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int answer = 0;
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] money = new int[n];
		for (int i = 0; i < n; i++) {
			money[i] = Integer.parseInt(br.readLine());
		}

		int[][] dp = new int[n + 1][k + 1];
		
		//for(int i=0;i<=k;i++) dp[0][i]=1;
		for(int i=0;i<=n;i++) dp[i][0]=1;
		
		
		for (int i = 1; i <= n; i++) {
			for (int p = money[i-1]; p <= k; p+=money[i-1]) {	
				for (int j = 1; j <= k; j++) {
					if(j<p) continue;
					dp[i][j] +=dp[i-1][j - p];
				}
			}
			for(int p=1;p<=k;p++)
				dp[i][p]+=dp[i-1][p];
			
		}
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=k;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print(dp[n][k]);
	}

}

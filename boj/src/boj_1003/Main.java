package boj_1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int zero=0;
	public static int one=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		int[][] dp=new int[41][2];
		dp[0][0]=1;	dp[0][1]=0;
		dp[1][0]=0;	dp[1][1]=1;
		
		for(int i=2;i<=40;i++) {
			dp[i][0]=dp[i-1][0]+dp[i-2][0];
			dp[i][1]=dp[i-1][1]+dp[i-2][1];
		}
		
		for(int i=0;i<T;i++) {
			int data=Integer.parseInt(br.readLine());
			System.out.println(dp[data][0]+" "+dp[data][1]);
		}

	}
}

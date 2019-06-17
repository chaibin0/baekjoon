package boj_11047_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str);
		int answer=0;
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		int[] money=new int[n];
		for(int i=0;i<n;i++) {
			money[i]=Integer.parseInt(br.readLine());
		}

		int[][] dp=new int[n+1][k+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				for(int p=1;p<=k/money[i-1];p++) {
					if(money[i-1]*p>j) break;
					if(j/(money[i-1]*p)==0 && j%(money[i-1]*p)==0) {
						dp[i][j]++;
						continue;
					}
					dp[i][j]+=dp[i][j-money[i-1]*p];
				}
			}
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}

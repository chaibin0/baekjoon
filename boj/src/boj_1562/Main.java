package boj_1562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* °è´Ü ¼ö*/
public class Main {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			int N=Integer.parseInt(br.readLine());
			long[][] dp=new long[10][N];
			if(N==1) {
				System.out.println(10);
				return;
			}
			Arrays.fill(dp[0],1);
			dp[0][0]=0;
			
			for(int i=0;i<N-1;i++) {
				for(int j=0;j<10;j++) {
					if(j==0) {
						dp[i+1][1]+=dp[i][0];
						continue;
					}
					
					if(j==9) {
						dp[i+1][8]+=dp[i][9];
						continue;
					}
					
					dp[i+1][j+1]+=dp[i][j];
					dp[i+1][j-1]+=dp[i][j];
					
					
				}
			}
			long result=0;
			
			for(int i=0;i<10;i++) {
				for(int j=0;j<N;j++) {
					System.out.print(dp[i][j]+" ");
				}
				System.out.println();
			}
			for(long value : dp[N-1]) {
				result+=value;
			}
			
			System.out.println(result);
			
			
			
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}

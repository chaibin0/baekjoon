package boj_9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
				int N=Integer.parseInt(br.readLine());
				int row=0;
				boolean[][] chess=new boolean[N][N];
				
				System.out.println(solve(N,row,chess));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int solve(int N, int row, boolean[][] chess) {
		if(N==1) return 1;
		
		int count=0;
		
		for(int column=0;column<N;column++) {
			if(row==0) {
				chess[row][column]=true;
				count+=solve(N,row+1,chess);
				chess[row][column]=false;
			}
			else if(checkCase(chess,row,column,N)) {
				if(row==N-1) { 
					count++;
					break;
				}
			
				chess[row][column]=true;
				count+=solve(N,row+1,chess);
				chess[row][column]=false;
			}
			
				
		}
		
		return count;
		
	}
	
	public static boolean checkCase(boolean[][] chess,int row, int column,int N) {
		for(int i=1;i<=row;i++) {
			if(chess[row-i][column])
				return false;
			if(column-i>=0&&chess[row-i][column-i])
				return false;
			if(column+i<N&&chess[row-i][column+i])
				return false;
		}
		return true;
	}

}

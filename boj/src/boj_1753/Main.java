package boj_1753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			int start,end,length;
			String str=br.readLine();
			StringTokenizer st=new StringTokenizer(str);
			int V=Integer.parseInt(st.nextToken());
			int E=Integer.parseInt(st.nextToken());
			int K=Integer.parseInt(br.readLine());
			
			int[][] path=new int[V][V];
			
			for(int i=0;i<E;i++) {
				str=br.readLine();
				st=new StringTokenizer(str);
				start=Integer.parseInt(st.nextToken());
				end=Integer.parseInt(st.nextToken());
				length=Integer.parseInt(st.nextToken());
				path[start][end]=length;
				path[end][start]=length;
			}
			
			boolean[] visit=new boolean[V];
			int[] distance=new int[V];
			for(int i=0;i<E;i++) {
				
				
			}
			
			
			
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}

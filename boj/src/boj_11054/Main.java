package boj_11054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			int N=Integer.parseInt(br.readLine());
			String str=br.readLine();
			StringTokenizer st=new StringTokenizer(str);
			List<Integer> list=new ArrayList<>();	
			for(int i=0;i<N;i++) 
				list.add(Integer.parseInt(st.nextToken()));
			System.out.println(solve(list));
			
			
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

	public static int solve(List<Integer> list) {
		
		int min=0;
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<i;j++) {
				
			}
			
			for(int j=i;i<list.size();j++) {
				
			}
		}
		return 0;
	}

}

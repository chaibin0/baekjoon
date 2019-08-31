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
		
		int[] forward=new int[list.size()];
		int[] backward=new int[list.size()];
	
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<i;j++) {
				if(list.get(j)<list.get(i))
					forward[i]=Math.max(forward[j]+1,forward[i]);
			}
		}
			
		for(int i=list.size()-1;i>0;i--) {
			for(int j=list.size()-1;j>i;j--) {
				if(list.get(j)<list.get(i))
					backward[i]=Math.max(backward[j]+1,backward[i]);
			}
		}
		int max=0;
		for(int i=0;i<list.size();i++) 
			max=Math.max(forward[i]+backward[i],max);
		
		return max+1;
	}

}

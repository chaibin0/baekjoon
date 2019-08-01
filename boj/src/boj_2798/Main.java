package boj_2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			StringTokenizer st;
			String str=br.readLine();
			st=new StringTokenizer(str);
			int N=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());
			
			str=br.readLine();
			st=new StringTokenizer(str);
			List<Integer> list=new ArrayList<>();
			for(int i=0;i<N;i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			System.out.println(solve(N,M,list));
				
		}catch(IOException e) {
			e.getStackTrace();
		}
	}
	
	public static int solve(int N,int M, List<Integer> list) {
		int result=0;
		int value=0;
		//reverse order
		Collections.sort(list);
		int count=0;
		for(int i=0;i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int k=j+1;k<N;k++) {
					value=list.get(i)+list.get(j)+list.get(k);
					if(value>M)
						continue;
					result=Math.max(result,value);
				}
			}
		}
		return result;
	}

}

package boj_1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		Set<Integer> set=new HashSet<>();
		
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str);
		for(int i=0;i<N;i++) 
			set.add(Integer.parseInt(st.nextToken()));
		
		
		int M=Integer.parseInt(br.readLine());
		str=br.readLine();
		st=new StringTokenizer(str);
		for(int i=0;i<M;i++) {////
			if(set.contains(Integer.parseInt(st.nextToken())))
				System.out.println(1);
			else
				System.out.println(0);
		}
	}

}

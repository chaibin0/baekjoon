package boj_4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=null;
		List<Integer> list=null;
		double avg=0;
		int C=Integer.parseInt(br.readLine());
		
		for(int i=0;i<C;i++) {
			String str=br.readLine();
			st=new StringTokenizer(str);
			
			int N=Integer.parseInt(st.nextToken());		
			int sum=0;
			int pass=0;
			list=new ArrayList<>();
			
			for(int j=0;j<N;j++) {
				int score=Integer.parseInt(st.nextToken());
				sum+=score;
				list.add(score);
			}
			avg=(double)sum/N;
			
			for(Integer number:list) 		//평균 넘은사람 체크
				if(number>avg)	pass++;
			
			System.out.printf("%.3f%%\n",(double)pass/N*100);
			
		}
	}

}

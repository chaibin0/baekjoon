package boj_1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str);
		
		int E=Integer.parseInt(st.nextToken());
		int S=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int first=1;
		int second=1;
		int third=1;
		int year=1;
		while(true) {
			if(E==first&&S==second&&M==third)
				break;
			if(first>=15)	first=1;
			else	first++;
			
			if(second>=28) second=1;
			else second++;
			
			if(third>=19) third=1;
			else third++;
			
			year++;
		}
		
		System.out.println(year);
	}

}

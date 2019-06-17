package boj_2455;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int max=0;
		int current=0;
		for (int i = 0; i < 4; i++) {
			String str = br.readLine();
			st=new StringTokenizer(str);
			int getOut = Integer.parseInt(st.nextToken());
			int getIn = Integer.parseInt(st.nextToken());			
			current+=(getIn-getOut);
			max=Math.max(max,current);
		}
		
		System.out.println(max);

	}

}

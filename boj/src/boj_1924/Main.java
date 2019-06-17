package boj_1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	final static int[] MONTH= {31,28,31,30,31,30,31,31,30,31,30,31};
	final static String[] DAY= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str);
		int month=Integer.parseInt(st.nextToken());
		int day=Integer.parseInt(st.nextToken());
		int total_day=day;
		for(int i=0;i<month-1;i++) {
			total_day+=MONTH[i];
		}
		
		System.out.println(DAY[total_day%7]);		
	}

}

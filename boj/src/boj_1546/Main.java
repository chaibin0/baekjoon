package boj_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str);
		int max=0;
		int sum=0;
		for(int i=0;i<T;i++) {
			int num=Integer.parseInt(st.nextToken());
			sum+=num;
			max=Math.max(max,num);
		}
		System.out.println((double)sum/(max*T)*100);
		
	}

}

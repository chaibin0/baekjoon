package boj_10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str);
		int N=Integer.parseInt(st.nextToken());
		int X=Integer.parseInt(st.nextToken());
		
		str=br.readLine();
		st=new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			int a=Integer.parseInt(st.nextToken());
			if(X>a) 
					System.out.print(a+" ");
		}
	}

}

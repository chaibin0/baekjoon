package boj_10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		while((str=br.readLine())!=null) {
			st=new StringTokenizer(str);
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			if(A==0 && B==0)
				return;
			System.out.println(A+B);
		}
		
	}

}

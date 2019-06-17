package boj_10950;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0;i<T;i++) {
			String str=br.readLine();
			st=new StringTokenizer(str);
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			bw.write((A+B)+"\n");
		}
		
		bw.flush();
	
	}

}

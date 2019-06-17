package boj_1049;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		int cost=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str=br.readLine();
		st=new StringTokenizer(str);
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int minPackge=1000;
		int minEach=1000;
		
		for(int i=0;i<M;i++) {		//예제 입력 및 가장 싼 브랜드 구한다.
			str=br.readLine();
			st=new StringTokenizer(str);

			minPackge=Math.min(minPackge,Integer.parseInt(st.nextToken()));
			minEach=Math.min(minEach,Integer.parseInt(st.nextToken()));
		}
		
		if(N<6) {
			cost=N*minEach;
		}
		else {
			cost=Math.min((N/6)*minPackge+(N%6)*minEach,N*minEach);
			cost=Math.min(cost,(N/6+1)*minPackge);
		}
		
		System.out.println(cost);
	}

}

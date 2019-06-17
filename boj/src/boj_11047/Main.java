package boj_11047;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str);
		int answer=0;
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		int[] money=new int[n];
		for(int i=0;i<n;i++) {
			money[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=money.length-1;i>=0;i--) {
			if(k/money[i]==0) continue;
			answer+=k/money[i];
			k=k%money[i];
		}
			
		System.out.println(answer);
	}

}

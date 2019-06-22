package boj_1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int temp=N;
		int count=0;
		while(true) {
			temp=10*(temp%10)+((temp%10+temp/10)%10);
			count++;
			if(temp==N)	break;
		}
		
		System.out.println(count);
		
	}

}

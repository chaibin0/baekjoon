package boj_2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			int N=Integer.parseInt(br.readLine());
			boolean flag=false;
			for(int i=1;i<=N;i++) {
				if(i+disassembleValue(i)==N) {
					System.out.println(i);
					flag=true;
					break;
				}
			}
			
			if(!flag)
				System.out.println(0);
				
		}catch(IOException e) {
			e.getStackTrace();
		}
	}
	
	public static int disassembleValue(int value) {
		int sum=0;
		while(value>0) {
			sum+=value%10;
			value/=10;
		}

		return sum;
	}

}

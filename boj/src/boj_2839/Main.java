package boj_2839;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt();
		int temp1=number/5;
		int answer=0;
		for(int i=0;i<=number/5;i++) {
			int temp=number;
			temp-=(i*5);
			if(temp%3==0)
				answer=Math.min(number, i+temp/3);
		}
		if(answer==0)
			System.out.println(-1);
		else
			System.out.println(answer);
		
	}

}

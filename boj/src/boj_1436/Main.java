package boj_1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){

			int N=Integer.parseInt(br.readLine());
			int num=666;
			int min=0;
			StringBuilder a=new StringBuilder();
			
			while(min<N) {
				if(findTripleSix(num)) {
					min++;
				}
				num++;

			}
			
			System.out.println(--num);
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

	public static boolean findTripleSix(int num) {
		int count = 0;
		boolean isSix=false;
		while (num > 0) {
			if (num % 10 == 6) {
				count++;
				isSix=true;
			}
			else {
				count=0;
				isSix=false;
			}
				
			num /= 10;
			if (count == 3)
				return true;
		}

		return false;
	}

}

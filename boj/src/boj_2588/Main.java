package boj_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			
			int firstNum=Integer.parseInt(br.readLine());
			int secondNum=Integer.parseInt(br.readLine());
			int answer=firstNum*secondNum;
			for(int i=0;i<3;i++) {
				System.out.println(firstNum*(secondNum%10));
				secondNum/=10;
			}
			System.out.println(answer);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

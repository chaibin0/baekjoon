package boj_11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String data=br.readLine();
		if(data.charAt(0)>=65)
			System.out.printf("%d",Integer.valueOf(data));
		else
			System.out.printf("%c",Integer.parseInt(data));
	}

}

package boj_1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			
			String str=br.readLine();
			StringTokenizer st=new StringTokenizer(str);
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			int w=Integer.parseInt(st.nextToken());
			int h=Integer.parseInt(st.nextToken());
		
			int xmin=Math.min(x,w-x);
			int ymin=Math.min(y,h-y);
			
			System.out.println(Math.min(xmin,ymin));
			
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}

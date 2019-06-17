package boj_1120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str);	
		String A=st.nextToken();
		String B=st.nextToken();
		int difference=50;
		for(int i=0;i<=B.length()-A.length();i++) 
			difference=Math.min(difference,compareString(A,B.substring(i,i+A.length())));
		System.out.println(difference);
	}
	
	public static int compareString(String A,String B) {
		int difference=0;
		for(int i=0;i<A.length();i++) {
			if(A.charAt(i)!=B.charAt(i))
				difference++;
		}	
		return difference;
		
	}
	
}

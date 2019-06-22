package boj_3048;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//Data Input
		String str=br.readLine();	//첫번째 줄
		StringTokenizer st=new StringTokenizer(str);
		
		int first=Integer.parseInt(st.nextToken());
		int last=Integer.parseInt(st.nextToken());
		String ReversedfirstGroup=br.readLine();
		String lastGroup=br.readLine();	
		//TestCase
		int T=Integer.parseInt(br.readLine());		
		String firstGroup="";
		
		//Reverse FirstGroup
		for(int i=ReversedfirstGroup.length()-1;i>=0;i--) 
			firstGroup+=ReversedfirstGroup.charAt(i);
		
		
		//Data Output
		int firstPosition=T;
		int lastPosition=first;
		String result="";
		for(int i=0;i<first+T||i<first+last;i++) {		//T가 너무 멀리떨어져있을때도 고려
			if(i>=lastPosition&&i<lastPosition+last) 
				result+=lastGroup.charAt(i-first);			
			if(i>=firstPosition&&i<firstPosition+first) 
				result+=firstGroup.charAt(i-T);		
		}
		System.out.println(result);

	}
	

}

package boj_1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String str = br.readLine();
			System.out.println(solve(str));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int solve(String str) {
		List<Integer> list=new ArrayList<>();
		StringBuilder number = new StringBuilder();
		int total=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				number.append(str.charAt(i));
			if (str.charAt(i) == '+') { // +
				total+=Integer.parseInt(number.toString());
				number=new StringBuilder();
			}
			if(str.charAt(i)=='-') {
				list.add(total+Integer.parseInt(number.toString()));
				total=0;
				number = new StringBuilder();
			}
			if(i==str.length()-1)
				list.add(total+Integer.parseInt(number.toString()));
		}
		
		int result=0;
		for(int i=0;i<list.size();i++) {
			if(i==0)
				result+=list.get(i);
			else
				result-=list.get(i);
			
		}
		return result;
	}
}

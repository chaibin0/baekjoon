package boj_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String num=br.readLine();
			List<Character> list=new ArrayList<>();
			for(int i=0;i<num.length();i++) {
				list.add(num.charAt(i));
			}
			Collections.sort(list,Collections.reverseOrder());
			
			StringBuilder result=new StringBuilder("");
			for(Character t:list) {
				result.append(t);				
			}
			
			System.out.println(result.toString());
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

}

package boj_10817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str);
		List<Integer> list=new ArrayList<>();
		list.add(Integer.parseInt(st.nextToken()));
		list.add(Integer.parseInt(st.nextToken()));
		list.add(Integer.parseInt(st.nextToken()));
		Collections.sort(list);
		
		System.out.println(list.get(1));
		
	}

}

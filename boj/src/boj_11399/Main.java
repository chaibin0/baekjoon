package boj_11399;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int answer=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		List<Integer> list=new ArrayList<>();
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str);
		for(int i=0;i<T;i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);

		for(int i=0,j=T;i<T;i++) {
			answer+=list.get(i)*j--;		
		}
		
		System.out.println(answer);
		
	}
	
}

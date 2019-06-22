package boj_2217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<N;i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);
		Collections.reverse(list);
		
		int max=0;			//최대 용량
		int count=0;		//현재 사용한 루프수
		for(int i=0;i<list.size();i++) {
			count++;
			max=Math.max(max,list.get(i)*count);
		}
		System.out.println(max);

	}

}



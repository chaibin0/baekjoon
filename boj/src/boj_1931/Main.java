package boj_1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][] arr=new int[n][2];
		int start,end;
		int answer=0;
		boolean flag=false;
		StringTokenizer st;
		List<Time> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			start=Integer.parseInt(st.nextToken());
			end=Integer.parseInt(st.nextToken());
			list.add(new Time(start,end));		
		}
		Collections.sort(list);
		for(int i=0;i<n;i++) {
			System.out.println(list.get(i).start+" "+list.get(i).end);
		}
		int max=0;
		for(int i=0;i<n;i++) {
			if(max<=list.get(i).start) {
				max=list.get(i).end;
				answer++;
			}
			
		}
		System.out.println(answer);
	}

}

class Time implements Comparable<Time> {
	
	int start;
	int end;
	Time(int start, int end){
		this.start=start;
		this.end=end;		
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	/*
	@Override
	public int compareTo(Time o) {
		if((this.end-this.start)==(o.end-o.start))
			return o.end-this.end;
		return (this.end-this.start)-(o.end-o.start);
	}
	*/
	@Override
	public int compareTo(Time o) {
		if(this.end==o.end)
			return this.start-o.start;
		return this.end-o.end;
	}
		
	
	
}

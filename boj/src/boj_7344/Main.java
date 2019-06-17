package boj_7344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static List<Integer> answerList=new ArrayList<>();

	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Wood> woodList;
		int testCase = Integer.parseInt(br.readLine()); // T	
		for (int i = 0; i < testCase; i++) {
			int n = Integer.parseInt(br.readLine());		
			st = new StringTokenizer(br.readLine());
			woodList = new ArrayList<>();		
			for (int j = 0; j < n; j++) {
				Wood wood = new Wood();
				wood.setSize(Integer.parseInt(st.nextToken()));
				wood.setWeight(Integer.parseInt(st.nextToken()));
				woodList.add(wood);
			}			
			run(woodList);			
		}
		
		for(Integer answer:answerList)
			System.out.println(answer);
	}
	
	static void run(ArrayList<Wood> woodList) {
		Collections.sort(woodList);
		Wood first;
		int answer=0;

		while(!woodList.isEmpty()) {
			answer++;
			first=new Wood(0,0);
			for(int i=0;i<woodList.size();i++) {
				if(first.getSize()<=woodList.get(i).getSize()&&first.getWeight()<=woodList.get(i).getWeight()) {
					first.setSize(woodList.get(i).getSize());
					first.setWeight(woodList.get(i).getWeight());
					woodList.remove(woodList.get(i));
					i--;
				}
			}
		}
		
		answerList.add(answer);
	}
}

class Wood implements Comparable<Wood> {
	private int size;
	private int weight;
	public Wood(int size,int weight){
		this.size=size;
		this.weight=weight;
	}
	public Wood() {}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Wood o) {
		if(this.weight==o.weight)
			return this.size-o.size;
		return this.weight-o.weight;
	}

}

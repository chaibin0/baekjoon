package boj_7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			int N=Integer.parseInt(br.readLine());
			int[] rank=new int[N];
			
			Arrays.fill(rank,1);
			String str;
			StringTokenizer st;
			List<Person> list=new ArrayList<>();
			for(int i=0;i<N;i++) {
				str=br.readLine();
				st=new StringTokenizer(str);
				int length=Integer.parseInt(st.nextToken());
				int weight=Integer.parseInt(st.nextToken());
				Person person=new Person(length,weight);
				list.add(person);
			}
			
			for(int i=0;i<N;i++) {
				Person person1=list.get(i);

				for(int j=i+1;j<N;j++) {
					Person person2=list.get(j);
					if(person1.equals(person2))
						continue;
					if(person1.getLength()>person2.getLength()&&person1.getWeight()>person2.getWeight())
						rank[j]++;
					if(person1.getLength()<person2.getLength()&&person1.getWeight()<person2.getWeight())
						rank[i]++;
					
				}
			}
			
			for(int i=0;i<N;i++) {
				System.out.print(rank[i]+" ");
			}
			
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}

class Person{
	private int length;
	private int weight;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + weight;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (length != other.length)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
	public Person(int length, int weight) {
		super();
		this.length = length;
		this.weight = weight;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}

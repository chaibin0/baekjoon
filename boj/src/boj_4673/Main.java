package boj_4673;

public class Main {
	public static boolean[] data=new boolean[10001];
	public static void main(String[] args) {
		for(int i=1;i<=10000;i++) {
			if(!data[i]) {
				System.out.println(i);
				recursion(i);
			}
		}
	}
	
	public static void recursion(int num) {
		String numString=String.valueOf(num);
		int total=num;
		for(int i=0;i<numString.length();i++) {
			total+=numString.charAt(i)-'0';
		}
		if(total<=10000) {
			data[total]=true;
			recursion(total);
		}		
	}
}

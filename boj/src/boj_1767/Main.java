package boj_1767;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long result=0;
		//K�� ���� M ���� N
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		
		int[][][] dp=new int[101][101][101];
		
		
		/* ���� 0���� ������ ���� 0���� ����*/
		/* 1�࿡ 2���� �ֳ� ����*/
		for(int i=1;i<101;i++) {		//��
			for(int j=1;j<101;j++) {	//��
				for(int p=1;p<101;p++) {
					//�ƹ��͵� ���� ���
					dp[i][j][p]+=permitaion(p,p);
					//���� n�� ���� ���
					
					//���� n�� ���� ���
				}
			}
		}
	
	}
	
	//nCp
	public static long combination(int n,int p) {
		double result=1;
		double top=1,down=1;
		if(n<=p||n<=0||p<=0) return 1;
		if(n-p<p) p=n-p;
		
		for(int i=n, j=1 ; i>n-p ; i--,j++) {
			result*=(double)i/j;
		}
		System.out.println("0    "+result);		

		return (long)result;
	}
	
	//nPp
	
	public static long permitaion(int n, int p) {
		double result=1;
		double top=1,down=1;
		if(n<=p||n<=0||p<=0) return 1;
		if(n-p<p) p=n-p;
		
		for(int i=n; i>n-p ; i--) {
			result*=(double)i%1000001;
		}
		System.out.println("1  "+result);		

		return (long)result;
	}
	//n!
	public static long factorial(int n) {
		long result=1;
		if(n<=0) return 1;
		for(int i=n;i>=1;i--) {
			result*=i;
			result%=1000001;
		}
		return result;
	}
}

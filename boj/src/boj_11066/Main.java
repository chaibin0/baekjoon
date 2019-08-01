package boj_11066;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*파일 합치기*/
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int testCase = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCase; i++) {
			int N = Integer.parseInt(br.readLine());
			String str = br.readLine();
			st = new StringTokenizer(str);
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < N; j++)
				list.add(Integer.parseInt(st.nextToken()));

			merge(N, list);
		}

	}

	static Integer sumDistance(int i, int j, List<Integer> sumFiles) {
		if (i == 0)
			return sumFiles.get(j); // 시작 부분이 처음일 때는 j까지만
		else
			return sumFiles.get(j) - sumFiles.get(i-1); // i~j구간의 합만큼의 합산
	}

	static void merge(int num, List<Integer> files) {
		int[][] dp = new int[files.size()][files.size()];
		
		List<Integer> sumFiles = new ArrayList<>();
		
		sumFiles.add(files.get(0));
	
		for (int i = 1; i < files.size(); i++)  // 0부터 N까지의 합계를 구함
			sumFiles.add(files.get(i) + sumFiles.get(i - 1));
		

		for (int i = 0; i < files.size() - 1; i++) // (1,2)(2,3)(3,4) 등 합쳐지는 것 초기화
			dp[i][i + 1] = files.get(i) + files.get(i+ 1);
		
		
		for (int j = 2; j < files.size(); j++) {
			for (int i = 0; i+j < files.size(); i++) {
				
				for (int k = i; k < i+j; k++) {
					if (dp[i][i+j] == 0)
						dp[i][i+j] = dp[i][k] + dp[k + 1][i+j] + sumDistance(i, i+j, sumFiles);
					else
						dp[i][i+j] = Math.min(dp[i][i+j], dp[i][k] + dp[k + 1][i+j] + sumDistance(i, i+j, sumFiles));
				}
			}
		}
		System.out.println(dp[0][files.size() - 1]);
	}
}

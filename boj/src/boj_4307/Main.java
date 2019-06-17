package boj_4307;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			st = new StringTokenizer(str);
			int l = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < n; j++)
				list.add(Integer.parseInt(br.readLine()));

			move(list, l);
		}
	}

	public static void move(List<Integer> list, int length) {
		int MIN_VALUE = 0;
		int MAX_VALUE = 0;
		for (Integer l : list) {
			if (l > length / 2) {
				MAX_VALUE = Math.max(MAX_VALUE, l);
				MIN_VALUE = Math.max(MIN_VALUE,  length-l);
			}else {
				MAX_VALUE=Math.max(MAX_VALUE,length-l);
				MIN_VALUE = Math.max(MIN_VALUE, l);
			}

		}

		System.out.println(MIN_VALUE + " " + MAX_VALUE);
	}
}

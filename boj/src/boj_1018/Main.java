package boj_1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 1018 체스판 다시 칠하기 */
public class Main {
	private static final int CHESS_SIZE = 8;

	public static String[] type1 = { "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB",
			"BWBWBWBW" };
	public static String[] type2 = { "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW",
			"WBWBWBWB" };
	public static String[] chess;
	
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int result = Integer.MAX_VALUE;
			
			chess = new String[N];
			for (int i = 0; i < N; i++) {
				chess[i] = br.readLine();
			}
			
			for (int row = 0; row <= N - CHESS_SIZE; row++) {
				for (int column = 0; column <= M - CHESS_SIZE; column++) {
					result = compare(type1, row, column, result);
					result = compare(type2, row, column, result);
				}
			}

			System.out.println(result);
		} catch (IOException e) {
			e.getStackTrace();
		}

	}

	public static int compare(String[] type, int row, int column, int min) {
		int difference = 0;
		for (int i = 0; i < CHESS_SIZE; i++) {
			for (int j = 0; j < CHESS_SIZE; j++) {
				if (type[i].charAt(j) != chess[row + i].charAt(column + j)) {
					difference++;
					if (difference >= min) {
						return min;
					}
				}

			}
		}

		return difference;
	}

}

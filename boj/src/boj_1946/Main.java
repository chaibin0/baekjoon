package boj_1946;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()); // Test Case

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			List<Score> scores = new ArrayList<>();
			for (int j = 0; j < N; j++) {
				Score score = new Score();
				String str = br.readLine();
				st = new StringTokenizer(str);
				score.document = Integer.parseInt(st.nextToken());
				score.interview = Integer.parseInt(st.nextToken());
				scores.add(score);
			}
			selection(scores);

		}
	}

	public static void selection(List<Score> scores) {
		Collections.sort(scores);
		int total=0;
		Score selection = new Score();
		for (Score score : scores) {
			if (score.document==1) { // 1등은 무조건 합격
				selection=score;
				total++;
				continue;
			}
			if (compare(selection, score)) {
				selection=score;
				total++;
			}
		}

		System.out.println(total);
	}

	public static boolean compare(Score selection, Score score) {
		if (selection.document < score.document && selection.interview < score.interview)
			return false;
		return true;
	}
}

class Score implements Comparable<Score> {
	int interview;
	int document;

	@Override
	public int compareTo(Score o) {
		if(this.document==o.document)
			return this.interview-o.interview;
		else
			return this.document-o.document;
	}

}

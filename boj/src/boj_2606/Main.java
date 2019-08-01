package boj_2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int answer=0;
			String str;
			StringTokenizer st;
			int computer = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			boolean[] visit = new boolean[computer + 1];
			boolean[][] virus = new boolean[computer + 1][computer + 1];
			int start, end;
			for (int i = 0; i < N; i++) {
				str = br.readLine();
				st = new StringTokenizer(str);
				start = Integer.parseInt(st.nextToken());
				end = Integer.parseInt(st.nextToken());
				virus[start][end] = true;
				virus[end][start] = true;
			}

			Queue<Integer> bfs = new LinkedList<>();
			
			bfs.add(1);
			
			while (!bfs.isEmpty()) {
				int value = bfs.poll();
				answer++;
				visit[value]=true;
				for (int i = 1; i <= computer; i++) {
					//자신이 아니고 방문하지 않고 연결되었을 경우
					if(value!=i&&virus[value][i]&&!visit[i]&&!bfs.contains(i)) {
						bfs.add(i);
					}
				}
			}
			
			System.out.println(answer-1);
		} catch (IOException e) {
			e.getStackTrace();
		}

	}

}

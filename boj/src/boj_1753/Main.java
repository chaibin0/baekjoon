package boj_1753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int start, end, length;
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(br.readLine());

			List<Map<Integer, Integer>> list = new ArrayList<>(V + 1);
			for (int i = 0; i <= V; i++)
				list.add(new HashMap<>());

			for (int i = 0; i < E; i++) {
				str = br.readLine();
				st = new StringTokenizer(str);
				start = Integer.parseInt(st.nextToken());
				end = Integer.parseInt(st.nextToken());
				length = Integer.parseInt(st.nextToken());
				if (!list.get(start).containsKey(end))
					list.get(start).put(end, length);
				else 					
					list.get(start).put(end, Math.min(list.get(start).get(end), length));
				
			}
			boolean[] visit = new boolean[V + 1];
			int[] distance = new int[V + 1];
			int choice = K;

			// 초기화
			visit[K] = true;
			for (int i = 1; i <= V; i++)
				distance[i] = (i == K) ? 0 : Integer.MAX_VALUE;

			boolean flag;
			for (int i = 1; i <= V; i++) {
				flag = false;
				Set<Integer> set = list.get(choice).keySet();
				for (Iterator<Integer> iter = set.iterator(); iter.hasNext();) {
					int next = iter.next();

					if (!visit[next]) { // 추가 길이 존재할경우
						flag = true;
						distance[next] = Math.min(distance[next], distance[choice] + list.get(choice).get(next));
					}
				}
				if (!flag) // 더이상 할게없다
					break;

				choice = 0;
				for (int j = 1; j <= V; j++) {
					if (!visit[j] && (choice == 0 || distance[choice] >= distance[j]))
						choice = j;
				}
				visit[choice]=true;
			}

			for (int i = 1; i <= V; i++)
				if (distance[i] == Integer.MAX_VALUE)
					System.out.println("INF");
				else
					System.out.println(distance[i]);

		} catch (IOException e) {
			e.getStackTrace();
		}
	}

}

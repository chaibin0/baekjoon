package boj_1753;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
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

				if (!list.get(start).containsKey(end)) {
					list.get(start).put(end, length);
				} else {
					list.get(start).put(end, Math.min(list.get(start).get(end), length));

				}

			}

			int[] distance = new int[V + 1];
			int choice = K;

			// ÃÊ±âÈ­
			for (int i = 1; i <= V; i++)
				distance[i] = (i == K) ? 0 : Integer.MAX_VALUE;

			for (int i = 1; i <= V; i++) {
				Set<Integer> set = list.get(choice).keySet();
				for (Iterator<Integer> iter = set.iterator(); iter.hasNext();) {
					int next = iter.next();

					distance[next] = Math.min(distance[next], distance[choice] + list.get(choice).get(next));

				}
				choice = 0;
				for (int j = 1; j <= V; j++) {
					if (choice == 0 || distance[choice] > distance[j])
						choice = j;
				}
			}

			for (int i = 1; i <= V; i++)
				if (distance[i] == Integer.MAX_VALUE)
					bw.write("INF\n");
				else
					bw.write(distance[i] + "\n");

		} catch (IOException e) {
			e.getStackTrace();
		}
	}

}
package boj_2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<Integer> set = new ArrayList<>();
			int N = Integer.parseInt(br.readLine());
			for (int i = 0; i < N; i++) {
				set.add(Integer.parseInt(br.readLine()));
			}
			Collections.sort(set);

			System.out.println(getMeanValue(set));
			System.out.println(getMedianValue(set));
			System.out.println(getModeValue(set));
			System.out.println(getRangeValue(set));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static int getMeanValue(List<Integer> set) {
		int sum = 0;
		for (int data : set) {
			sum += data;
		}
		return (int) Math.round((double) sum / set.size());
	}

	private static int getMedianValue(List<Integer> set) {
		return set.get(set.size() / 2);
	}

	private static int getModeValue(List<Integer> set) {
		Map<Integer, Integer> fre = new TreeMap<>((o1, o2) -> o1 - o2);
		List<Integer> maxValue = new ArrayList<>();
		for (int i = 0; i < set.size(); i++) {
			
			if (fre.containsKey(set.get(i))) {
				fre.put(set.get(i), fre.get(set.get(i)) + 1);
			} else {
				fre.put(set.get(i), 1);
			}

		}
		int maxFrequency = 0;
		Set<Integer> key = fre.keySet();
		for (int value : key) {
			if (maxFrequency < fre.get(value)) {
				maxValue = new ArrayList<>();
				maxFrequency = fre.get(value);
				maxValue.add(value);
				continue;
			}

			if (maxFrequency == fre.get(value)) {
				maxValue.add(value);
				continue;
			}
		}
		if(maxValue.size()!=1) {
			return maxValue.get(1);
		}
		return maxValue.get(0);
	}

	private static int getRangeValue(List<Integer> set) {
		return set.get(set.size() - 1) - set.get(0);
	}

}

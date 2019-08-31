package boj_4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	private static Deque<Character> stack;

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = "";
			while ((line = br.readLine()) != null) {
				boolean yes = true;

				stack = new ArrayDeque<>();
				stack.pollLast();
				if (line.charAt(0) == '.')
					break;

				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == '.')
						break;
					if (!compare(line.charAt(i))) {
						yes = false;
						break;
					}
				}
				if (yes == false) {
					System.out.println("no");
				} else {
					System.out.println(stack.isEmpty() ? "yes" : "no");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static boolean compare(char symbol) {
		if (symbol == '(' || symbol == '[') {
			stack.addLast(symbol);
		}
		if (symbol == ' ') {
			if (stack.isEmpty())
				return false;

			return stack.pollLast() == '(';
		}
		if (symbol == ']') {
			if (stack.isEmpty())
				return false;
			return stack.pollLast() == '[';
		}
		return true;

	}
}
